/**
  * Created by luis on 3/22/2017.
  */
object FoldLeft {


  def foldLeftForAdd(lista:List[Int]):Int={
    lista.foldLeft(0)(_+_)
  }

  def main(args: Array[String]): Unit = {
    val evenList = List(2,4,6,8,10)
    println(evenList.foldLeft(0)(_+_))
  }
}
