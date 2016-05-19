package com.tsoft.tutorial.scala.classes.step12

object FunctionsAsArguments {

  def tenTimes( callback:(String)=>Unit) {
    for(a <- 1 to 10 ) {
      callback(a.toString)
    }
  }

  def main(args: Array[String]) {

    val f = (num:String) => println(num)

    tenTimes( f )

    val fAdvanced = (num:String,prefix:String) => println(prefix+num)
    // Currying, i.e. a function with not enough of args will yield another function
    val f2 = fAdvanced(_:String,"pre")

    tenTimes( fAdvanced(_,"pre") )
    tenTimes( f2 )

  }
}
