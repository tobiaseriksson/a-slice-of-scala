package com.tsoft.tutorial.scala.classes.step13

case class User(name:String,age:Int)

object MapReduce {

  def main(args: Array[String]) {

    val users = Seq( User("Tobias",43), User("Ingvar",55), User("Marcus",44), User("Hassan",35), User("Karl", 36) )

    val calcTotalAge = ( acc:Int, age:Int ) => acc+age
    val totalAge = users.map( u => u.age ).reduceLeft( calcTotalAge )
    println(s"Total Age is $totalAge")

    val overFourty = ( lst:Seq[User], usr:User ) => if( usr.age > 40 ) lst :+ usr else lst
    val listOverFoutry = users.foldLeft(Seq[User]())( overFourty )
    println(s"List of users over 40: "+listOverFoutry.mkString(","))
  }
}
