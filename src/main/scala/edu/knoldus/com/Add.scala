package edu.knoldus.com

trait Add[A,B]{
  def apply(x:A,y:B):A
}

object Add1 extends App{
  val addition: Add[Int,Int]=new Add[Int,Int]{
    def apply(x:Int,y:Int):Int=x+y
  }
 println(addition.apply(3,5))

}
