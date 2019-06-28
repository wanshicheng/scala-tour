package com.skillip

object StringDemo {
  def main(args: Array[String]): Unit = {
    val i = 1015645456
    val str =
      s"""
        |hhh
        |hhh
        |   hhhh$i
      """.stripMargin
    println(str)
  }
}
