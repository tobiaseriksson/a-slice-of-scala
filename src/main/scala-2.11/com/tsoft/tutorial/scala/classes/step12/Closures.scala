package com.tsoft.tutorial.scala.classes.step12

object Closures {

  def generateFunction(max:Int) = {
    val func = (i:Int) => {
      if( i >= max ) println(s"$i is more or equal to MAX($max)")
      else println(s"Max($max) not reached for $i!")
    }
    func
  }

  def main(args: Array[String]) {
    val maxControl = generateFunction(10)
    for(a <- 5 to 15) {
      maxControl(a)
    }
  }

}
