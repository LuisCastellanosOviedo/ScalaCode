/**
  * Created by User on 25/03/2017.
  */
object TestList {

  def newStringList(a:String,b:String,c:String):List[String]={
    a::b::c::Nil
  }

  def AddElementFistToList(a:Int,lista :List[Int]): List[Int] ={
       a::lista
  }

  def AddElementEndList(a:Int,lista :List[Int]): List[Int] ={
      lista:+a
  }

  def deleteElementFromList(element:Int ,lista  :List[Int]):List[Int]={
      lista.filterNot(_ == element)
  }

  def deleteByFunction[A](lista:List[A],op:(A)=>Boolean):List[A]={
    lista.filterNot(op(_))
  }

}
