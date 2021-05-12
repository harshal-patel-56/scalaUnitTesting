package com.example.scalatest

import org.scalatest.FunSuite

class HelloScalaTest extends FunSuite {

  // unit test for sayHello method
  test("testSayHello") {

    // try not to write any println statements in the final test code, you may do it while developing.
    val expected = "hello"
    val actual = HelloScala.sayHello()

    assert(actual.equals(expected))

  }

}
