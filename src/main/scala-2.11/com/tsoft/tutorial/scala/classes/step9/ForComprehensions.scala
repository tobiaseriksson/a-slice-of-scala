package com.tsoft.tutorial.scala.classes.step9

/**
  * Created by tobias on 17/08/16.
  */
object ForComprehensions {


  def theseForAreAllTheSame() = {
    for( i <- 1 to 3 ) {
      for( a <- 1 to 5 ) {
        println(s"$i:$a")
      }
    }

    for( i <- 1 to 3 ; a <- 1 to 5 ) {
      println(s"$i:$a")
    }

    (1 to 3).foreach( i => (1 to 5).foreach( a => println(s"$i:$a")))
  }


  def usingYield() = {

    val numbers = for( i <- 1 to 5 ) yield {i*2}
    //  = Vector(2, 4, 6, 8, 10)

    val numbers2 = (1 to 5).map(_*2)
    //  = Vector(2, 4, 6, 8, 10)

    val names:Seq[String] = Seq( "Ola", "Tobias", "Cecilia", "Marcus", "Ingvar" )
    val capNames = for( name <- names ) yield name.toUpperCase
    // capNames: Seq[String] = List(OLA, TOBIAS, CECILIA, MARCUS, INGVAR)
  }

  def moreAdvancedForComprehension() = {

    // The for-yield can be used on collections, with one or many, in this case an Option[String]
    val car:Option[String] = Some("volvo")
    val name:Option[String] = Some("kalle")

    val tmp = for{ c <- car
                   n <- name
    } yield c+":"+n
    println("These two lines give the same result... in fact the for-yield is translated into flatMap-map in this case")
    println(tmp)
    println(car.flatMap(c=>name.map(n=>c+":"+n)))
    //Some(volvo:kalle)
    //Some(volvo:kalle)

    // This is a common for-yield, where we loop over a list of Option, and we return a list of something else...
    val maxSizeOpt:Option[Int] = Some(4) // try with None
    val nameOpts:Seq[Option[String]] = Seq( Some("Kalle"), Some("Lisa"), Some("Maja") )
    val nameSizes = for{ nameOpt <- nameOpts
                         name <- nameOpt
                         maxSize <- maxSizeOpt
                         if( name.size <= maxSize )
    } yield name.size

    println("nameSizes:"+nameSizes.mkString(","))
    // nameSizes:4,4
  }

  def main(args: Array[String]): Unit = {
    theseForAreAllTheSame()
    usingYield()
    moreAdvancedForComprehension()
  }

}
