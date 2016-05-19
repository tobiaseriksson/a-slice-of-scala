package com.tsoft.tutorial.scala.classes.step3

/**
  *
  * In Scala data should be immutable !!!
  * That is why by default all the arguments are val not var
  *
  */

class Individual(val firstName:String,val lastName:String,val favoriteColor:String="Red") {

  def getName() = firstName+" "+lastName

  override def toString() : String = firstName+" "+lastName+" with favourite color "+favoriteColor
}

case class IndividualCC(firstName:String, lastName:String,favoriteColor:String="Red") {

  def getName() = firstName + " " + lastName
  override def toString : String = firstName+" "+lastName+" with favourite color "+favoriteColor
}

object Demo {
  def main(args: Array[String]) {
    val ind = new Individual("Tobias","Eriksson","Blue")
    /* We can not do this anymore
    ind.firstName="Marcus"
    */
    println("Name:"+ind)

    val ind2 = IndividualCC("Marcus","Holgersson","Yellow")  // NOTE! that 'new' is not required for Case Classes !!!
    /* we can not do this anymore, the case class is by default immutable */
    // ind2.firstName="Ingvar"
    /* BUT we can do this
    */
    val ind3 = ind2.copy( firstName = "Ingvar", lastName = "Abrahamsson" ) // with the copy we preserv the attributes not mentioned in the copy, this is convenient
    println("Orig Name:"+ind2)
    println("Modified Name:"+ind3)

  }
}
