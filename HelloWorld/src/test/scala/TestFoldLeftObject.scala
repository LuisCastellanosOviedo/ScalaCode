import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by luis on 3/24/2017.
  */
class TestFoldLeftObject  extends  FreeSpec with Matchers  {

  " testing object fold left " - {

    val listtest = List(1,2,3,4,5,6,7,8,9)
    FoldLeft.foldLeftForAdd(listtest) should be (45)

  }
}
