package com.tsoft.tutorial.scala.classes.step12

object FunctionalLiteral {

  def main(args: Array[String]) {

    val numbers = List.range(1,10)
    val evenNumbers = numbers.filter( (i:Int) => i%2==0 )

    // could be written like this instead
    def isEven(i:Int) = i%2==0
    val isEvenMore = (i:Int) => i%2==0
    val evenNumbers2 = numbers.filter( isEven )
    val evenNumbers3 = numbers.filter( isEven )

    // could be written like this too
    val evenNumbers4 = numbers.filter( _%2==0 )

    println(evenNumbers)
    println(evenNumbers2)
    println(evenNumbers3)
    println(evenNumbers4)
  }


}
