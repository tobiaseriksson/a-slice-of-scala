package com.tsoft.tutorial.scala.classes.step1

class Individual {
  private var firstName:String=null
  private var lastName:String=null

  def setFirstName(name:String) = {
    firstName = name
  }

  def setLastName(name:String) = {
    lastName = name
  }

  def getName = firstName+" "+lastName

  override def toString : String = firstName+" "+lastName
}

object Demo {
  def main(args: Array[String]) {
    val ind = new Individual()
    ind.setFirstName("Tobias")
    ind.setLastName("Eriksson")
    println("Name:"+ind.getName)
    println("Name:"+ind)
  }
}

