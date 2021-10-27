package edu.knoldus.com

trait sumList[list]{
  def apply(list:List[Int]):Int
}
object SumOfList extends App {
  val summationOfList:sumList[List[Int]]=new sumList[List[Int]]{
    def apply(list:List[Int]):Int=list.sum
  }

  println(summationOfList.apply(List(1,2,3,4,5,8,4,9,10)))


}
