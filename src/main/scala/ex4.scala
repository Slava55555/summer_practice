import scala.math.BigDecimal.double2bigDecimal

class ex4 {
  def result(Z: Double, C: Double): Double = {
    val t = 0.02 // Глубина шлифования (мм)
    // Диапазон значений z
    val zRange = 0.3 to 0.5 by 0.05
    val z = zRange.minBy(option => Math.abs(Z - option.doubleValue))
    // Диапазон значений c
    val cRange = 1.7 to 2.1 by 0.1
    val c = cRange.minBy(option => Math.abs(C - option.doubleValue))
    val Ra = c.doubleValue * Math.pow(t, z.doubleValue)
    return Ra
  }
}
