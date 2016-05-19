package com.tsoft.tutorial.scala.classes.step5

abstract class animal(name:String) {
  def sayYourName() = {
    println(s"My name is $name")
  }
}

/*
// This does not work since traits CAN NOT have constructor attributes
trait spicies(name:String) {
  def sayYourName() = {
    println(s"My name is $name")
  }
}
*/


trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}

class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc
  def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}

// Adding a trait to any class !!!

trait Sounds {
  def bark(): Unit = {
    println("Bark!")
  }
}

class Dog {
  def eat() = {
    println("I am eating")
  }
}

object AbstractVsTrait {

  def AddFunctionalityToAnyClass() = {
    val animal = new Dog() with Sounds
    animal.eat()
    animal.bark()
  }

  def testSimilarity() = {
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)
    println(p1.isNotSimilar(p2))
    println(p1.isNotSimilar(p3))
    println(p1.isNotSimilar(2))
  }

  def main(args: Array[String]) {
    AddFunctionalityToAnyClass()
  }


}


