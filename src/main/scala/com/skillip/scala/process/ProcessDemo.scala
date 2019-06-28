package com.skillip.scala.process

import util.control.Breaks._

object ProcessDemo {
  def main(args: Array[String]): Unit = {
    var n = 0
    breakable {
      while(n <= 20) {
        n += 1
        println(n)
        if (n == 18) break()
      }
    }
  }
}
