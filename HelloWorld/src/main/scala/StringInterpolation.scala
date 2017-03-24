/**
  * Created by luis on 3/22/2017.
  */
object StringInterpolation {

  def interpolationOnlyString()={
    val name = "luis"
    println(s" mi nombre es $name")
  }


  def interpolationStringDouble()={
    val name = " luis "
    val value = 1.9d

    println(f" $name%s  is $value%2.2f meters tall ")
  }

  def main(args: Array[String]): Unit = {
  interpolationStringDouble()
  }
}
