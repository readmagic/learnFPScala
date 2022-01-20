package com.ch1.course

class CreditCard {def charge(price: Double): Unit = {}}

class Coffee() {val price = 100}

class Cafe {
  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()
    cc.charge(cup.price)//副作用
    cup
  }
}
