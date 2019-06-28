package com.skillip.scala.homework

object Bank {
  def main(args: Array[String]): Unit = {
    val ca = new CheckingAccount(1000)
    println(ca.deposit(100))
    println(ca.withdraw(10))
  }
}


class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double)= {
    super.deposit(amount - 1)

  }
  override def withdraw(amount: Double) = {
    super.withdraw(amount + 1)
  }
}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}
