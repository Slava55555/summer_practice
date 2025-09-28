import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.AppendedClues.convertToClueful

class ex2Test extends AnyFunSuite {
  val test = new ex2
  test("result - без покрытия, Q0 = 1000") {
    assert(test.result(1000, "без покрытия") == Array(80.0, 85.0))
  }
  test("result - кадмиевое, Q0 = 1000") {
    assert(test.result(1000, "кадмиевое") === Array(55.0, 100.0))
  }
  test("result - неизвестный ") {
    assertThrows[IllegalArgumentException](test.result(1000, "неизвестный")) withClue "Условие не выполнено"
  }
  test("result - Q0 = 0") {
    assert(test.result(0, "без покрытия") === Array(0.0, 0.0))
  }
}
