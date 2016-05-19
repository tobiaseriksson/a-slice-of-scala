package com.tsoft.tutorial.scala.classes.step11

object MatchCaseDemo {


  def main(args: Array[String]) {

    val result = 200

    result match {
      case 1 | 2 | 3 => println("One of the first three")
      case 10 => println("Exactly 10")
      case x if x > 100 => println("More than 100")
      case _ => println("Anything else")
    }

    val numbers = Seq( 11, 2 ) // , 233, 66, 11)

    numbers match {
      case Seq() => println("Empty list of numbers")
      case Seq(x) => println(s"List with ONLY one number $x")
      case Seq(x,y) => println(s"List with ONLY two numbers $x and $y")
      case lst => println(s"List with lots ${lst.mkString(",")}")
    }
  }
}
