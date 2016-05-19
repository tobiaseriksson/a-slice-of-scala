package com.tsoft.tutorial.scala.classes.step8

class NString(str:String) {

  def *(n:Int) = {
    (1 to n).map( _ => str).mkString("")
  }
}

object Naming {

  def main(args: Array[String]) {
    val manyStrings = new NString("Tobias")
    val tmp1 = manyStrings.*(7)
    val tmp2 = manyStrings *(7)
    val tmp3 = manyStrings * 7
    println(tmp1)
    println(tmp2)
    println(tmp3)
  }
}
