package com.skillip.scala.homework

class Poker(val design: String, val color: String) {
  def isRed: Boolean ={
    if (color == "red") true
    else false
  }

  //
  override def toString = {
    if("♣♦♥♠".contains(design) && design.length == 1) design
    else ""
  }
}

object Poker {
  def main(args: Array[String]): Unit = {
    val p1 = new Poker("♠", "red");
    println(p1.isRed)
    println(p1)

    val p2 = new Poker("xx", "green");
    println(p2.isRed)
    println(p2)
  }

}