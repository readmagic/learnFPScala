package com.chapterTwo.course

import scala.annotation.tailrec

/**
  *
  * 第二章节案例
  * Created by IntelliJ IDEA.
  * User: bin.yu
  * Date: 2017/3/14 
  * Time: 20:10
  *
  */
object Course02 {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    @tailrec
    def loop(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else loop(n - 1, n * acc)
    }

    loop(n, 1)
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial value of %d is %d"
    msg.format(n, factorial(n))
  }

  private def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s value of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    print(formatResult("factorial", 3, factorial))
  }
}
