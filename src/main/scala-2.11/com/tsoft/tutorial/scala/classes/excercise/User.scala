package com.tsoft.tutorial.scala.classes.excercise

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

case class User(name:String,age:Int,gender:String) {

}

object Utils {
  val rand = Random

  def generateLots(howMany:Int) = {
    (1 to howMany).map( _ => {
      User( randomName, randomAge, randomGender )
    })
  }

  def randomName = {
    val names = Seq( "Tobias", "Marcus", "Ingvar", "Anna", "Lisa", "Elisabeth", "Karl", "Anders", "Henrik", "Petter", "Michael", "Cecilia", "Maria", "Christian", "Bob")
    names( rand.nextInt(names.size) )
  }

  def randomAge = rand.nextInt(100)

  def randomGender():String = {
    val genders = Seq( "Male", "Female" )
    genders( rand.nextInt(2) )
  }

  def main(args: Array[String]) {

    val users = generateLots(100)
    users.foreach( println )

    val topFemaleNames =
      users.filter( u => u.gender=="Female" )   // Pick out the "Female"s only => Seq[User]
      .groupBy( u => u.name )  // group-by the users name => map of (String,Seq[User])
      .mapValues( _.size )  // iterate over the values of the map and calc the size of each Seq[User] => Map[String,Int]
      .toList // Convert it into a list of tuple2's List[ (String,Int) ]
      .sortBy( _._2 )(Ordering[Int].reverse) // sort the list by the second tuple element, i.e. the size, and reverse the sorting order
      .take(10) // take the 10 first elements in the list => List[(String,Int)]

    println("Top-10 Female names in this list")
    topFemaleNames.foreach(println)

  }

}