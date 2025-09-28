import scala.math.BigDecimal.double2bigDecimal

class ex3 {
  def result(axialClearance: Double): Double = {
    // Шаг резьбы гайки
    val threadPitch = 1.0
    // Начальный и конечный осевые зазоры
    val range = 0.004 to 0.01 by 0.002
    val axis = range.minBy(option => Math.abs(axialClearance - option.doubleValue))
    return (axis.doubleValue / threadPitch) * 360
  }
}
