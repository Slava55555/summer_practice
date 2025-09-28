class ex2 {
  def result(Q0: Double, coating: String): Array[Double] = {
    // Функция для расчета момента трения
    def calculateFrictionMoment(Q0: Double, ft: Double, d0: Double, a: Double): Double = {
      return (1.0 / 3.0) * Q0 * ft * (a * 3 - d0 * 3) / (a * 2 - d0 * 2)
    }

    // Параметры гайки и болта
    val d0 = 16.0 // Диаметр отверстия под болт (мм)
    val a = 20.0 // Внешний диаметр опорного торца (мм)
    // Коэффициенты трения для ВТ6
    val fFirstUncoated = 0.16
    val fFirstCadmium = 0.11
    val fTenthUncoated = 0.17
    val fTenthCadmium = 0.2
    // Расчет момента трения для первой затяжки
    val MtFirst = coating match {
      case "без покрытия" => calculateFrictionMoment(Q0, fFirstUncoated, d0, a)
      case "кадмиевое" => calculateFrictionMoment(Q0, fFirstCadmium, d0, a)
      case _ =>
        throw new IllegalArgumentException("Условие не выполнено")
    }

    // Расчет момента трения для десятой затяжки
    val MtTenth = coating match {
      case "без покрытия" => calculateFrictionMoment(Q0, fTenthUncoated, d0, a)
      case "кадмиевое" => calculateFrictionMoment(Q0, fTenthCadmium, d0, a)
    }
    //     Вывод результатов
    return Array(MtFirst, MtTenth).map(_.asInstanceOf[Double])
  }
}
