import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by luis on 3/24/2017.
  */
class TestMultilne  extends  FreeSpec with Matchers{


  "Test Multile " - {
    Multiline.funcionMultiLine() should be (""" esto
es una
prueba
con enter
.
    """.stripMargin)
  }
}
