

object ExampleDoWhile {
  
  
  def dowhile()={
     var k = 0
     do{
       println(s" el valor de k es --> $k")
       k=k+1
     }while(k<6)
  }
  
  def main(args: Array[String]): Unit = {
    dowhile()
  }
}