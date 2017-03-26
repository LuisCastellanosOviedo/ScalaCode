import org.scalatest.{Matchers, path}

/**
  * Created by User on 25/03/2017.
  */
class TestFunctionLiteral extends  path.FreeSpec with Matchers{

  " test function Literal toma dos enteros y les aplica la funcion" - {

    FunctionLiteralExample.mainAplicoFuncionBinaria(3,3,(_+_)) should be (6)

  }

  " test function Literal toma dos enteros y les aplica la funcion" - {

    FunctionLiteralExample.mainAplicoFuncionBinaria(3,3,(_*_)) should be (9)

  }


  " toma dos elementos y los vuelve lista "-{
    def toList(a:Int,b:Int):List[Int]={
      List(a,b)
    }

    FunctionLiteralExample.RetornoToListInt(1,2,toList(_,_)) should be (List(1,2))
  }
}
