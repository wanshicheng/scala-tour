package com.skillip.scala.str

object StringDemo {
  def main(args: Array[String]): Unit = {
    printf(s"$$")

    val str =
      """
        |select *
        | from db;
      """.stripMargin

    println(str)
  }
}
