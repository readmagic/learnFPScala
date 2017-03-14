package com.chapterTwo.exercise

import scala.annotation.tailrec

/**
  *
  * 实现isSorted方法,检测Array[A]是否按照给定的比较函数排序
  * Created by IntelliJ IDEA.
  * User: bin.yu
  * Date: 2017/3/14 
  * Time: 20:35
  *
  */
object Answer0202 {

  /**
    * 自己实现的方法
    *
    * @param as
    * @param ordered
    * @tparam A
    * @return
    */
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(cur: Int): Boolean = {
      if (cur < as.length - 1) {
        if (ordered(as(cur), as(cur + 1))) {
          loop(cur + 1)
        } else {
          ordered(as(cur), as(cur + 1))
        }
      } else {
        ordered(as(cur - 1), as(cur))
      }
    }

    if (as.length < 2) true
    else loop(0)
  }


  /**
    * 官方答案
    * 是不是不正确
    *
    * @param as
    * @param ordered
    * @tparam A
    * @return
    */
  def isSortedByOfficial[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) false
      else go(n + 1)
    go(0)
  }

  def main(args: Array[String]): Unit = {
    print(isSortedByOfficial(Array(1, 2, 3, 4), (a: Int, b: Int) => a < b))
  }

}
