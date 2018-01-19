package scalaEssential.Exercises.objects

/**
  * Created by LuisCO on 19/01/2018.
  */
class Film(val name:String,val yearOfRelease:Int,val imdbRating:Double, val director:Director ) {

  def directorsAge () : Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy (director:Director):Boolean=true
}
