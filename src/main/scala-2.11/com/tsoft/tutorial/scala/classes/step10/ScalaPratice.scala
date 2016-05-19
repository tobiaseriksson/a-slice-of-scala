package com.tsoft.tutorial.scala.classes.step10

import scala.util.{Failure, Success, Try}

object ScalaPratice {
  val configFound = false
  val config = "some config"

  def getConfig() : Option[String] = {
    if(configFound) return Some(config)
    None
  }
  def process(value:Int) = {
    if( value > 10 ) throw new Exception(s"Values above 10 not allowde, $value provided.")
    value*3
  }

  def main(args: Array[String]) {
    getConfig match {
      case Some(cfg) => println(cfg)
      case None => println("No config!")
    }
    val result = Try(process(13))
    result match {
      case Success(res) => println(s"Result $res")
      case Failure(throwable) => println("We failed due to "+throwable.toString)
    }
  }
}
