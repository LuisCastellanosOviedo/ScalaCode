/**
  * Created by User on 25/03/2017.
  */
object StringExist {

  def testExistString(param:String): Boolean ={
    param.exists(_.isUpper)
  }


}
