package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of: " + n + " first need: " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of: " + n)

      result
    }
  }

  println(factorial(5))

  //TAIL RECURSION
  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)
  }

  println(anotherFactorial(500))

  /*
      Exercises:
      1.  Concatenate a string n times
      2.  IsPrime function tail recursive
      3.  Fibonacci function, tail recursive.
  */

  //1.
  def stringConcatenator(string: String, n: Int, accumulator: String): String = {
    if (n == 0) accumulator
    else stringConcatenator(string, n - 1, accumulator + string)
  }

  println(stringConcatenator("Konrad Rudnicki ",50,""))

  //2.
  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(m: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (m <= 1) true
      else isPrimeTailRec(m - 1, n % m != 0  && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }

  println("-------------")
  println(isPrime(8))
  println(isPrime(9))
  println(isPrime(10))
  println(isPrime(11))
  println(isPrime(12))
  println(isPrime(13))
  println("-------------")

  //3.
  def fibonacciFunction(n: Int): BigInt = {
    def fibonacciTailRec(m: Int, last: Int, nextToLast: Int): BigInt =
      if (m >= n) last
      else fibonacciTailRec(m + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciTailRec(2,1,1)
  }

  println(fibonacciFunction(5))
}