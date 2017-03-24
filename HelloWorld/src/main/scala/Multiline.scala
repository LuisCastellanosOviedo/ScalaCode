/**
  * Created by luis on 3/22/2017.
  */
object Multiline {

  def funcionMultiLine()={
    println(
      """ esto
        |es una
        |prueba
        |con enter
        |.
      """.stripMargin)
  }

  def funcionMultiLineMargin()={
    println(
      """Estoy
        |usando multilne con }
        |stripmargin""".stripMargin)
  }
  def main(args: Array[String]): Unit = {
   funcionMultiLine()
    funcionMultiLineMargin()
  }
}
