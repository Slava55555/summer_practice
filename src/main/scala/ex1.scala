class ex1 {
  def result(A:Double,R:Double,deg:Double): Double = {
      val l=math.toRadians(deg)
      val r=(-(A*math.sin(l)-R*math.pow(math.cos(l),2))-
        math.sqrt(math.pow(A*math.sin(l)-R*math.pow(math.cos(l),2)-A,2)-
          (math.pow(math.sin(l),2)+1-2*math.sin(l))*
            (math.pow(A,2)-math.pow(R,2)*math.pow(math.cos(l),2))))/
        (math.pow(math.sin(l),2)+1-2*math.sin(l))
      return r
  }
}
