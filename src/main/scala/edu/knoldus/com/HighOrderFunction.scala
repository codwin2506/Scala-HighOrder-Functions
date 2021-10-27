package edu.knoldus.com

trait HighOrder {
  def higherOrderFunction(f: (Int => Int), num : Int):Int
}

object highOrderObj extends App {
  def func(i:Int):Int=i
  val finalResult: HighOrder = new HighOrder {
    def higherOrderFunction(f: Int => Int, num: Int): Int = f(num)
  }
  val res=highOrderObj
  println(res.finalResult.higherOrderFunction(highOrderObj.func,15))

}

