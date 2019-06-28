package com.skillip.scala.homework

import scala.math._

object Shape {
  def main(args: Array[String]): Unit = {
    val s1 = new Rectangle(new Dot(0, 0), new Dot(10, 10))
    println(s1.centerPoint)
    println(s1.area)

    val s2 = new Circle(new Dot(0,0), 10)
    println(s2.centerPoint)
    println(s2.area)
  }
}

abstract class Shape {
  def centerPoint: Dot
}

class Dot(val x: Double, val y: Double) {
  override def toString = {
      s"x=$x,y=$y"
  }
}

class Rectangle(val a: Dot, val b: Dot) extends Shape {
  override def centerPoint: Dot = {
    new Dot((a.x + b.x) / 2, (a.y + b. y) / 2)
  }

  def area = {
    abs(a.x - b.x) * abs(a.y - b.y)
  }
}

class Circle(val cp: Dot, val r: Double) extends Shape {
  override def centerPoint: Dot = cp

  def area = {
    Pi * r * r
  }
}