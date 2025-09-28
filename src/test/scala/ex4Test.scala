import org.scalatest.funsuite.AnyFunSuite

class ex4Test extends AnyFunSuite {
  val test = new ex4
  test("z=0.5, c=1.7") {
    assert(test.result(0.5, 1.7) == 0.24041630560342614)
  }
  test("z=0.35, c=1.8") {
    assert(test.result(0.35, 1.7) == 0.4323240739316471)
  }
  test("тесты с числами, которые не входят в промежуток") {
    assert(test.result(0.55, 1.75) == 0.24041630560342614)
  }

}
