/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.pattern

object Functional {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {

    var factor = 3
    val multiplier = (i: Int) => i * factor

    val l1 = List(1, 2, 3, 4, 5) map multiplier

    factor = 5
    val l2 = List(1, 2, 3, 4, 5) map multiplier

    println(l1)
    println(l2)

    for (i <- 1 to 10)
      println(s"$i: ${factorial(i)}\n")

    val list1 = List("Programming", "Scala")
    val list2 = "People" :: "should" :: "read" :: list1
    println(list2)

    def concatUpper(s1: String, s2: String): String = (s1 + " " + s2).toUpperCase
    //Calling concatUpper with an underscore ( _ ) turns the method into a function value.
    val c = concatUpper _
    println(c("short", "pants"))
    val c2 = concatUpper("short", _: String)
    println(c2("pants"))

  }

  def factorial(i: BigInt): BigInt = i match {
    case _ if i == 1 => i
    case _           => i * factorial(i - 1)
  }

}
