package com.skillip.scala.homework

object Point {
  def main(args: Array[String]): Unit = {
    val p = new LabelPoint("test", 10.1, 100.1)
    println(p.x)
  }
}

class Point(val x:Double, val y:Double)

class LabelPoint(val label: String, x: Double, y: Double)
  extends Point(x, y)
