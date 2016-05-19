package com.tsoft.tutorial.scala.classes.step13

import scala.collection.mutable.ArrayBuffer

object ImmutableLists {


  def main(args: Array[String]) {
    val numbers = Seq( 2, 5 ,7 ,9, 13, 21 )
    val tmp  = numbers.map( v => v*2 ).filter( v => v%3==0 )
    println("Double Up and divisible by 3 "+tmp.mkString(","))

    // Can we really add to a Vector, it is immutable,
    // well kind of, this will create a NEW vector
    val vec = Vector( "Tobias", "Marcus", "ingvar" )
    // vec(1) = "Hassan" this is not possible !!!
    val vec2 = vec :+ "Karl"
    println(vec2.mkString(","))

    val vec3 = Vector("Hassan","Mohsin")
    val vec4 = vec ++ vec3
    println(vec4.mkString(","))

    // OR use mutable sequence instead :-)
    var fruits = ArrayBuffer[String]()
    fruits += "Apple"
    fruits += "Orange"
    fruits += "Banana"
    fruits += "Pear"
    fruits.foreach(println)
  }

}
