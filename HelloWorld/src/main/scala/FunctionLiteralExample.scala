/**
  * Created by User on 25/03/2017.
  */
object FunctionLiteralExample {

  def mainAplicoFuncionBinaria(a:Int,b:Int,op:(Int,Int)  => Int):Int= {
    op(a,b)
  }

  def RetornoToListInt(a:Int,b:Int,op:(Int,Int)=>List[Int]):List[Int]={
    op(a,b)
  }



}
