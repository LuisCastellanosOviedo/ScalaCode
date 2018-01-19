package scalaEssential.Exercises.objects

/**
  * Created by LuisCO on 19/01/2018.
  */
object ChipShop {

  def willServe(c:Cat):Boolean=c.food.toLowerCase().equals("chips")
}
