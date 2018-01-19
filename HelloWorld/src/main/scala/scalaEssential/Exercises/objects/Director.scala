package scalaEssential.Exercises.objects

/**
  * Created by LuisCO on 19/01/2018.
  */
class Director(val firstName:String,val lastName:String,val yearOfBirth:Int ) {

  def name():String=firstName.concat(lastName)

}
