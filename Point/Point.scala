object Point extends App{
  val t1=ClockTime(6,0)
  val t2=ClockTime(18,0)
  //val p2=Point(18,0)


//Anonymous function
    val printInfo =(t:ClockTime) => t match {
    case ClockTime(18,_) => println("sunset") //match case
    case ClockTime(6,_) => println("sunrise")
    case _ => println(t)
  }

  println(t1)
  println(t2)
  printInfo(t1) //calling the printInfo function



}

case class ClockTime(h:Int,m:Int)

case class Point(x:Int,y:Int){ // take x and y as a value ,don't need ***def x :Int =a*** like function


  def move(dx:Int,dy:Int):Point={return Point(this.x+dx,this.y+dy)}
  def +(p:Point):Point={return Point(this.x+p.x,this.y+p.y)}


}
