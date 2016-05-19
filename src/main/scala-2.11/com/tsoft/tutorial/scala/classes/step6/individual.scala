package com.tsoft.tutorial.scala.classes.step6

class Individual(val firstName:String,val lastName:String,val favoriteColor:String="Red") {
  println("Constructor called!")
  def this(name:String) = this(name,"Eriksson")
  override def toString() : String = s"$firstName $lastName with favourite color $favoriteColor"
}

object Individual {
  def apply() = {
    new Individual("no first","no last")
  }

  def apply(name:String) = {
    new Individual(name,"Smith","Green")
  }
}

object Demo {
  def main(args: Array[String]) {
    val ind1 = new Individual("Tobias","Eriksson","Blue")
    val ind2 = Individual("Ingvar")
    val ind3 = new Individual("Marcus")
    val ind4 = Individual()
    println("Name 1:"+ind1)
    println("Name 2:"+ind2)
    println("Name 3:"+ind3)
    println("Name 4:"+ind4)
  }
}
