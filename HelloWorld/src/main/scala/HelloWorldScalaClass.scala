/**
  * Created by luis on 1/23/2017.
  */
class HelloWorldScalaClass {


  def test(x:Int):String ={
    "test"
  }

  def printOnScreen():Unit={

    print(test(5))

  }

  def main(args: Array[String]): Unit = {
    print(printOnScreen())
  }


}
