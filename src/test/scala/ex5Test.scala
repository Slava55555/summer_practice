import org.scalatest.funsuite.AnyFunSuite
class ex5Test extends AnyFunSuite {
  val test = new ex5
  test("cумма всех %=100"){
    assert(test.result(1).sum.toInt  == 100)
    assert(test.result(10).sum.toInt  == 100)
    assert(test.result(2).sum.toInt == 100)
  }
}
