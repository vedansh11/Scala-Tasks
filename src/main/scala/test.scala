class test {

  trait Shapes

  case class Rectangle(l:Int,b:Int)  extends Shapes
  case class Circle(r:Int) extends Shapes
  case class Triangle(b:Int , h:Int) extends Shapes
  case class Square(l:Int)  extends Shapes

  val input:List[Shapes] =List(Rectangle(10,12),Triangle(4,2),Square(20),Circle(4),Square(10),Circle(6),Square(1),Circle(8),Rectangle(11,13),Triangle(5,2),Rectangle(9,13))


  def fun(list:List[Shapes]):Int={
    list.count(x=>x match {
      case Rectangle(l,b) => true
      case _ => false
    })
  }

  println(fun(input))


}
