package com.example.scalatest

object HelloScala {

  def sayHello(): String = {
    "hello"
  }

  def main(args: Array[String]): Unit = {
    println("Business logic start...")

    // Use several methods
    println(sayHello())

    println("Business logic end...")
  }
}
