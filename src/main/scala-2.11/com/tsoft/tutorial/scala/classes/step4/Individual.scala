package com.tsoft.tutorial.scala.classes.step4

class Individual {
  private var pfirstName:Option[String]=None
  private var plastName:Option[String]=None

  /**
    * Getters and Setters a convenient way to work with mutable instances and be able to apply rules
    *
    */
  def firstName = pfirstName
  def firstName_=(name:String) = {
    if( name.contains("_") ) throw new Exception(s"Oops! illeagal characte '_' found! in $name")
    pfirstName = Some(name)
  }

  def lastName = plastName
  def lastName_=(name:String) = {
    if( name.contains("_") ) throw new Exception(s"Oops! illeagal characte '_' found! in $name")
    plastName = Some(name)
  }

  override def toString() : String = firstName.getOrElse("")+" "+lastName.getOrElse("")

  def getName = firstName.getOrElse("")
}

object Demo {
  def main(args: Array[String]) {
    val ind = new Individual
    ind.firstName = "Tobias"
    ind.lastName = "Eriksson"
    println("Name:"+ind)

    try {
      ind.firstName = "Juan_Diego"
      ind.lastName = "Diaz"
      println("Name:"+ind)
    }
    catch {
      case t:Throwable => println("Exception: "+t)
    }
  }
}
