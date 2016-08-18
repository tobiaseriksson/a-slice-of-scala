package com.tsoft.tutorial.scala.classes.step9

object Loops {

  def main(args: Array[String]) {

    var a = 0
    for( a <- 1 to 10 ) {  // Range
      println( a )
    }

    var x = 0; var y = 0
    for( // this is a nested loop 1-10 done 3 times
      x <- 1 to 3;
      y <- 1 to 10 )
    {
      println(x+" "+y)
    }

    val names = Seq( "Tobias", "Ingvar", "Marcus" )
    for( name <- names ) { // iterate over a list/array/sequence
      println(name)
    }

    val modifiedNames =
      for{  // this will give a new seq of strings
        name <- names
        if( name.contains("s") )
      }
      yield s"---$name---"

    println(s"Only Names that contains 's' : ${modifiedNames.mkString(",")}")



  }

}
