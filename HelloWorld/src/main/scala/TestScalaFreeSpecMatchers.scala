import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by luis on 3/24/2017.
  */
class TestScalaFreeSpecMatchers extends FreeSpec with Matchers{


  " hello world with freespec and matchers " - {

    val test = "this is awesome ! "

    test should be ("this is awesome ! ")
  }
}
