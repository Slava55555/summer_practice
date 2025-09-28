import org.scalatest.funsuite.AnyFunSuite

class ex3Test extends AnyFunSuite {
  val test = new ex3
  test("axial = 0.004") {
    assert(test.result(0.004) == 1.44)
  }
  test("axial = 0.006") {
    assert(test.result(0.006) == 2.16)
  }
  test("axial = 0.008") {
    assert(test.result(0.008) == 2.88)
  }
  test("axial = 0.01") {
    assert(test.result(0.01) == 3.6)
  }
  test("тесты с числами, которые не входят в промежуток") {
    assert(test.result(0.0041) == 1.44)
    assert(test.result(0.005) == 1.44)
    assert(test.result(0.0051) == 2.16)
    assert(test.result(0.0059) == 2.16)
  }

}
