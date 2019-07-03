package com.skillip.scala.patternmatch

object MyWhileDemo {
  def main(args: Array[String]): Unit = {
    var i = 0
    mywhile(i < 10) {
      println(i)
      i += 1
    }

  }

  def mywhile(condition: => Boolean)(op: => Unit): Unit = {
    if(condition) {
      op
      mywhile(condition)(op)
    }
  }
}
