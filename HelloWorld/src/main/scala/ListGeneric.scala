/**
  * Created by luis on 3/22/2017.
  */
object ListGeneric {


  def toList[A](value:A) = List(value)

  def main(args: Array[String]): Unit = {
      println(toList("texto prueba").length)
      println(toList("texto prueba"))
  }
}
