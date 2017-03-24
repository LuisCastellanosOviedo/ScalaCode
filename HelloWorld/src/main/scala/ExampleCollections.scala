

object ExampleClllections {
  /*
   * 
   *             traversable
   * 									|
   * 							Iterable
   * 									|
   * 					_______________________________
   * 				set(no repite ) - MaP (key ,value ) - seq ( list vectores ) 
   * 																							|
   * 																		_____________________
   * 																			indexedSeq(vector , array, range ) - linearseq( queue ..    
   * 
   */
  
  
  def main(args: Array[String]): Unit = {
    val arrayFrutas = Array("pera","mandana")
    println(arrayFrutas.apply(0))
    println(arrayFrutas(0))
    println(arrayFrutas.length)
    println(arrayFrutas.isEmpty)
    println(arrayFrutas.nonEmpty)
    println(arrayFrutas.indexOf("pera"))
    
  }
  
  
  
}