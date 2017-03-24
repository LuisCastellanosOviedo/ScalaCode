/**
  * Created by luis on 3/22/2017.
  */
object valWithXML {


  def printxmlVal={
    val xmlValue = <book>
      <title>Scala in Action</title>
      <author>Nilanjan Raychaudhuri</author>
    </book>

    println(xmlValue)
  }

  def insertvalIntoXML(text:String)={
    val xmlValue = <book>
      <title>Scala in Action</title>
      <author>{text}</author>
    </book>

    println(xmlValue)
  }
  def main(args: Array[String]): Unit = {
    printxmlVal
    insertvalIntoXML("luis")
  }
}
