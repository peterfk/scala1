/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.scala1

object Hello {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    val num: Int = 4
    val name: String = "Peter"
    var msg: String = s"Hello $name, netbeans world, maven works too!!"

    var num2: Int = 5
    num2 = 8
    //num2 = "Test"

    val fucMsg = myFirstMethod
    println(fucMsg)

    println(msg)

    println(max(3, 8))

    val myList = List("This", "is", "immutable")
    myList.foreach(println)

    val pigeon = new Bird("grey")
    println("The Pigoen color is " + pigeon.color)

    val cat = new Cat(7, "Black")
    println(cat.jump)
    println(cat.sleep)

    println(House.getColor)

    println(s"Is the house locked " + House.locked)
    House.locked = "no"
    println(s"Is the house locked " + House.locked)

    //Person is case class
    val person = new Person("Jon", "Doe", 34)
    println(person)
    val kid = new Person("Jake", "Doe", 13)

    val people: Array[Person] = new Array[Person](2)
    people(0) = person
    people(1) = kid
    val (minors, adults) = people.partition(_.age < 18)
    println(minors(0))

  }

  def myFirstMethod(): String = { "exciting times ahead" }

  def max(a: Int, b: Int): Int = if (a > b) a else b

  def toList[A](value: A) = List(value)

  class Bird(val color: String)

  def singleExpression: List[String] => (List[Int], List[Int]) = { a => a map (_.toInt) partition (_ < 30)
  }

  val succ = (x: Int) => x + 1

  val succFunction = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }

}

