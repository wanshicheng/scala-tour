package com.skillip.scala.`implicit`

object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {
    implicit  def f1(d:Double): Int = {
      d.toInt
    }

    val num: Int = 3.5
    print(num)

  }
}
