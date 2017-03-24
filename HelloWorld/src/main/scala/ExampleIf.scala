

object ExampleIf {
  
  
  def ejemploIf(a:Int):Unit={
    if(a==5){
      println("a vale 5 ")
    }else if(a==6){
      println("a vale 6 ")
    }else{
      println("no vale 5 ni 6 ")
    }
  }
  
  
  def ternario(a:Int):Unit={
    println(if (a==3)"vale 3 " else "no vale 3 ")
  }
  def main(args: Array[String]): Unit = {
   
    println ("*********  ejemplos con if sencillo")
    ejemploIf(5)
    ejemploIf(6)
    ejemploIf(7)
    println ("*********  ejemplos con if ternario ")
    ternario(3)
    ternario(4)
  }
}