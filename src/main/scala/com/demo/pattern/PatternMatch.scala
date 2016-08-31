/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.pattern

object PatternMatch {

  case class Person(name: String, age: Int)

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {

    //pattern matching
    val bools = List(true, false)
    for (bool <- bools) {
      bool match {
        case true  => println("heads")
        case false => println("tails")
        //        case _     => println("something other than heads or tails (yikes!)")
      }
    }

    val sundries = List(23, "Hello", 8.5, 'q')
    for (sundry <- sundries) {
      sundry match {
        case i: Int    => println("got an Integer: " + i)
        case s: String => println("got a String: " + s)
        case f: Double => println("got a Double: " + f)
        case other     => println("got something else: " + other)
      }
    }

    val willWork = List(1, 3, 23, 90)
    val willNotWork = List(4, 18, 52)
    val empty = List()
    for (l <- List(willWork, willNotWork, empty)) {
      l match {
        case List(_, 3, _, _) => println("Four elements, with the 2nd being '3'.")
        case List(_*)         => println("Any other list with 0 or more elements.")
      }
    }

    val willWork2 = List(1, 3, 23, 90)
    val willNotWork2 = List(4, 18, 52)
    val empty2 = List()

    for (l <- List(willWork2, willNotWork2, empty2)) {
      print("List: ")
      processList(l)
    }

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)
    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!") 
        case Person("Bob", 33) => println("Hi Bob!") 
        case Person(name, age) =>
          println("Who are you, " + age + " year-old person named " + name + "?")
      }
    }

  }

  def processList(l: List[Any]): Unit = l match {
    case head :: tail =>
      print(s"$head ")
      processList(tail)
    case Nil => println("")
}

  }
