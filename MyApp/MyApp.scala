object Point extends App{
  val p1=new Point(2,3)
  val p2=new Point(5,6)
  println(p1)
  println(p2)
}

class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  override def toString="(" +x+ "," +y+ ")"
}
