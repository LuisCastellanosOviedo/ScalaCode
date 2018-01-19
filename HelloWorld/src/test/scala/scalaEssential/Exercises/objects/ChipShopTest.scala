package scalaEssential.Exercises.objects

import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by LuisCO on 19/01/2018.  ESSENTIALS 3.1.6.2
  */
class ChipShopTest extends  FreeSpec with Matchers{

  val Henderson = new Cat("Henderson","Ginger","Chips")
  val Quentin = new Cat("Quentin","Tabby and white","Curry")

 " cat with ship fav food " - {
   ChipShop.willServe(Henderson) should be (true)
 }

  " cat with NOT ship fav food " - {
    ChipShop.willServe(Quentin) should be (false)
  }

}
