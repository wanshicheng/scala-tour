package com.skillip

object Hello {
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = a + 1
    println(b)

    val names: (String, String) = ("lisi", "zs")
    println(names._1)
    println(names._2)

  }
}
