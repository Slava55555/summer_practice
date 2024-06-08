//
//object NumericalIntegration {
//
//  def main(args: Array[String]): Unit = {
//    val x = Symbol("x")
//    val F = math.cos(math.exp(x / 3) + x)
//    val a = 0.0
//    val b = 3.0
//    val h = 0.5
//    val n = ((b - a) / h).toInt
//
//    def leftRectangles(): Double = {
//      var X = List[Double]()
//      var arr = List[Double]()
//      var summ = 0.0
//      for (i <- 1 to n + 2) {
//        X = (a + (i - 1) * h) :: X
//      }
//      for (i <- 1 to n + 1) {
//        arr = F.subs(x, X(i - 1)) :: arr
//      }
//      for (i <- 0 until arr.length) {
//        summ = summ + arr(i).toFloat
//      }
//      summ * h
//    }
//
//    def rightRectangles(): Double = {
//      var X = List[Double]()
//      var arr = List[Double]()
//      var summ = 0.0
//      for (i <- 1 to n + 2) {
//        X = (a + (i) * h) :: X
//      }
//      for (i <- 0 to n + 1) {
//        arr = F.subs(x, X(i)) :: arr
//      }
//      for (i <- 0 until arr.length) {
//        summ = summ + arr(i).toFloat
//      }
//      summ * h
//    }
//
//    def middleRectangles(): Double = {
//      var Xx = List[Double]()
//      var XX = List[Double]()
//      var Xu = List[Double]()
//      var arr = List[Double]()
//      var summ = 0.0
//      for (i <- 1 to n + 1) {
//        Xx = (a + (i - 1) * h) :: Xx
//      }
//      for (i <- 1 to n + 2) {
//        XX = (a + (i) * h) :: XX
//      }
//      for (i <- 1 until n) {
//        Xu = ((Xx(i) + XX(i)) / 2) :: Xu
//      }
//      for (i <- 0 until Xu.length) {
//        summ = summ + F.subs(x, Xu(i))
//      }
//      summ * h
//    }
//
//    def trapezoidal(): Double = {
//      var X = List[Double]()
//      var arr = List[Double]()
//      var summ = 0.0
//      for (i <- 1 to n + 1) {
//        X = (a + (i - 1) * h) :: X
//      }
//      for (i <- 0 until X.length) {
//        arr = F.subs(x, X(i)) :: arr
//      }
//      h * ((((F.subs(x, a)) + F.subs(x, b)) / 2) + arr.sum)
//    }
//
//    def simpsons(): Double = {
//      val f_expr = (x: Double) => math.cos(math.exp(x / 3) + x)
//      val result = org.apache.commons.math3.analysis.integration.SimpsonIntegrator. simpsonIntegrate(8, f_expr, a, b)
//      result
//    }
//
//    println("Метод средних прямоугольников: " + sredn())
//    println("Метод правых прямоугольников: " + prav())
//    println("Метод левых прямоугольников: " + levprim())
//    println("Метод трапеций: " + trap())
//    println("Метод парабол: " + sympson())
//  }
//}
