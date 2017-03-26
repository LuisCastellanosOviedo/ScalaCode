import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by User on 25/03/2017.
  */
class TestStringExist extends FreeSpec with Matchers  {

  "  true si al notar que hay un character mayuscula " - {

    StringExist.testExistString("Avion") should be (true)
  }

}
