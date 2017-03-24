import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by luis on 3/24/2017.
  */
class testCrearFuncionesSuma extends  FreeSpec with Matchers{

  " deberia sumar dos elementos " - {

    CrearFunciones.suma(5,5) should be (10)
  }

}
