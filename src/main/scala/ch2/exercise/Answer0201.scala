package com.ch2.exercise

import java.beans.Transient

import scala.annotation.tailrec

/**
  *
  * 题目:写一个递归函数，来获取第N个斐波那契前两个斐波那契数0和1，第N个数总是等于它前两个数的和——序列开始为0、1、1、2、3、5。
  * 应该定义为局部（local）尾递归函数
  * Created by IntelliJ IDEA.
  * Date: 2017/3/14
  * Time: 14:10
  *
  */

object Answer0201 {

  /**
    *
    * 递归解法
    *
    * @param n 第几个斐波那契数
    * @return 斐波那契数
    */
  def fibNotTailrec(n: Int): Int = {
    if (n <= 2) {
      n - 1
    } else {
      fib(n - 1) + fib(n - 2)
    }
  }

  /**
    * 尾递归解法
    *
    * @param n
    * @return
    */
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n - 1, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    print(fib(6))
  }
}
