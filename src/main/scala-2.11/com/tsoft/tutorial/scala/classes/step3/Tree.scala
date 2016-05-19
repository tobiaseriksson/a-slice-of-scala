package com.tsoft.tutorial.scala.classes.step3

sealed abstract class Tree   // the keyword sealed means that all sub-classes must be defined INSIDE this file
case class Node(left: Tree, right: Tree) extends Tree
case class Leaf[A](value: A) extends Tree
case object EmptyLeaf extends Tree

object DemoCaseClass {

  def crawl(node:Tree):Unit = {
    node match {
      case Node(left,right) => {
        println("node")
        crawl(left)
        crawl(right)
      }
      case Leaf(x) => println(x)
      case EmptyLeaf => println("Empty Leaf")
    }
  }


  def main(args: Array[String]) {

    val aTree = Node( Node( Leaf("one"), Node( Leaf("two"), Leaf("three"))),Leaf("four"))
    val sameTree = new Node( new Node( new Leaf("one"), new Node( new Leaf("two"), new Leaf("three"))), new Leaf("four")) // but this is so much more complicated !

    /**
      *          root
      *          /  \
      *       node "four"
      *      /   \
      *  "one"   node
      *          /  \
      *      "two"  "three"
      *
      */

    println("A Tree")
    crawl( aTree )
    println("Same Tree")
    crawl( sameTree )


  }

}