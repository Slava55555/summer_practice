import org.scalatest.funsuite.AnyFunSuite
class ex1Test extends AnyFunSuite{
  val test=new ex1
  test("деление на 0"){
    assert(test.result(7,3,90).isInfinite)
  }
  test("различные тесты"){
    assert(test.result(7,3,270)==1.75)
  }
}
