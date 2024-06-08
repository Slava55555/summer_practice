import scala.util.Random

class ex5 {
  def generateDimensions(n: Int, baseDiameter: Double, tolerance: Double): List[Double] = {
  (1 to n).map(_ => baseDiameter + Random.nextDouble() * tolerance).toList
}

  def classifyConnections(shafts: List[Double], holes: List[Double]): (List[Double], List[Double], List[Double]) = {
    val connections = shafts.zip(holes)
    val toleranceThreshold = 0.01

    connections.partition { case (shaft, hole) =>
      val difference = hole - shaft
      difference > toleranceThreshold
    } match {
      case (withGap, withInterference) =>
        val noGap = connections.filter { case (shaft, hole) =>
          math.abs(hole - shaft) <= toleranceThreshold
        }
        (withGap.map { case (shaft, hole) => hole - shaft },
          withInterference.map { case (shaft, hole) => hole - shaft },
          noGap.map { case (shaft, hole) => hole - shaft })
    }
  }
  def result(n: Int): Array[Double] = {
    val toleranceShaft = 0.05
    val toleranceHole = 0.08
    val baseShaftDiameter = 10.0
    val baseHoleDiameter = 10.0
    val shafts = generateDimensions(n, baseShaftDiameter, toleranceShaft)
    val holes = generateDimensions(n, baseHoleDiameter, toleranceHole)
    val (withGap, withInterference, noGap) = classifyConnections(shafts, holes)

    // Рассчитываем проценты для каждой группы
    val gapPercent = withGap.size.toDouble * 100 / n
    val interferencePercent = withInterference.size.toDouble * 100 / n
    val noGapPercent = noGap.size.toDouble * 100 / n

    // Вычисляем разницу между суммой процентов и 100
    val difference = 100 - (gapPercent + interferencePercent + noGapPercent)

    // Распределяем разницу по группам пропорционально их размерам
    val adjustedGapPercent = gapPercent + difference * gapPercent / (gapPercent + interferencePercent + noGapPercent)
    val adjustedInterferencePercent = interferencePercent + difference * interferencePercent / (gapPercent + interferencePercent + noGapPercent)
    val adjustedNoGapPercent = noGapPercent + difference * noGapPercent / (gapPercent + interferencePercent + noGapPercent)

    // Возвращаем скорректированные проценты
    return Array(adjustedGapPercent, adjustedInterferencePercent, adjustedNoGapPercent).map(_.asInstanceOf[Double])
  }
}
