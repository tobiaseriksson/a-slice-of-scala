package com.tsoft.tutorial.scala.classes.step2

class Individual(var firstName:String,var lastName:String) {
  var favouriteColor:String = "Red"

  def setFirstName(name:String) = {
    firstName = name
  }

  def setLastName(name:String) = {
    lastName = name
  }

  def getName() = firstName+" "+lastName

  override def toString() : String = firstName+" "+lastName+" favourite color "+favouriteColor
}

object Demo {
  def main(args: Array[String]) {
    val ind = new Individual("Tobias","Eriksson")
    ind.setFirstName("Ingvar")
    ind.firstName="Marcus"
    ind.favouriteColor = "Blue"
    ind.setLastName("Abrahamsson")
    println("Name:"+ind.getName())
    println("Name:"+ind)
  }
}
