import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by User on 25/03/2017.
  */
class TestingList extends  FreeSpec with Matchers {

  " new list string"-{
    TestList.newStringList("This is a ","inmutable ", " List Motherfucker !!!").foldLeft("")(_+_) should be ("This is a inmutable  List Motherfucker !!!")
  }

  "add value at first pos "-{
    TestList.AddElementFistToList(1,List(2,3)) should be (List(1,2,3))
  }

  "add value at the end "-{
    TestList.AddElementEndList(3,List(1,2)) should be (List(1,2,3))
  }

  " lista debe eliminar cuando elemento sea == al parametro " -{
    TestList.deleteElementFromList(1,List(1,2,3)) should be (List(2,3))
    TestList.deleteElementFromList(2,List(1,2,3)) should be (List(1,3))
    TestList.deleteElementFromList(3,List(1,2,3)) should be (List(1,2))
  }

  " lista debe eliminar segun la funciona que se le pase"-{

    def deleteInt(a:Int):Boolean=a==3
    def deleteString(a:String):Boolean = a =="b"

    TestList.deleteByFunction(List(1,2,3),(deleteInt(_))) should be (List(1,2))
    TestList.deleteByFunction(List("a","b","c"),deleteString(_)) should be (List("a","c"))

  }


}
