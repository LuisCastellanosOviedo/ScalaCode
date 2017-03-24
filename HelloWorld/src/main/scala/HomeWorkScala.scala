import org.scalatest.{FreeSpec, Matchers}

import scala.annotation.tailrec

/**
  * Created by luis on 1/23/2017.
  */
class HomeWorkScala  extends FreeSpec with Matchers {



" is left parenthesis "-{




}

" homework recursion "- {

  val GetLeftParenthesis = (s:String,parLeft:Int) =>  if (s =="(") parLeft+1  else parLeft
  val GetRightParenthesis = (s:String,parRight:Int) =>  if (s ==")") parRight+1  else parRight
  val isValid = (parLeft: Int, parRight:Int )=> if(parRight == parLeft )true else false


  def isBalanced(s: String): Boolean ={

    @tailrec
    def parenthessis(current:String, parLeft :Int,parRight:Int): Boolean ={
      if(current.length==0 ){
       isValid(parLeft,parRight)
      }else{
        parenthessis(current.tail,GetLeftParenthesis(current.head.toString,parLeft),GetRightParenthesis(current.head.toString(),parRight))
      }
    }
    parenthessis(s,0,0)
  }


  "(a".charAt(0).toString should be ("(")
  "(a".length() should be (2)
  "(a".substring(1) should be ("a")
  isBalanced("a") should be (true)
  isBalanced("(a") should be (false)
  isBalanced("((1+2) + 4)")  should be (true)
  isBalanced("(1+2") should be (false)

}

  " homework recursion just one var  "- {

    val countParenthesis = (s:Char,parLeft:Int) =>  if (s =="(") parLeft+1  else if (s ==")") parLeft-1 else parLeft
    val isValid = (parLeft: Int)=> if(parLeft == 0 )true else false

    def isBalanced(s: String): Boolean ={
      @tailrec
      def parenthessis(current:String, cont :Int): Boolean ={
        if(current.length==0  ){
          isValid(cont)
        }else{
          parenthessis(current.tail,countParenthesis(current.head,cont))
        }
      }
      parenthessis(s,0)
    }


    "(a".charAt(0).toString should be ("(")
    "(a".length() should be (2)
    "(a".substring(1) should be ("a")
    isBalanced("a") should be (true)
    isBalanced("(a") should be (false)
    isBalanced("((1+2) + 4)")  should be (true)
    isBalanced("(1+2") should be (false)

  }
}
