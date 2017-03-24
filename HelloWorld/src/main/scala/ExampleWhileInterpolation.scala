

object ExampleWhileInterpolation {
  
  def whileExample():Unit = {
    
    var a = 0
    while(a<4){
      println(s"valor de a es --> $a")
      a=a+1
    }
  }
  
  def main(args: Array[String]): Unit = {
    whileExample()
  }
}