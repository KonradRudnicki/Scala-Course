package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3)) // calling function is an expression

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("hi")

  def aBigFuntion(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
      Exercises:
      1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
      2.  Factorial function 1 * 2 * 3 * .. * n
      3.  A Fibonacci function
          f(1) = 1
          f(2) = 1
          f(n) = f(n - 1) + f(n - 2)
      4.  Tests if a number is prime.
     */

  //1
  def aGreetingFunction(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."

  println(aGreetingFunction("Konrad", 20))

  //2
  def factorialFunction(n: Int): Int = {
    if (n <= 1) 1
    else n * factorialFunction(n - 1)
  }

  println(factorialFunction(5))

  //3
  def aFibonacciFunction(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(8))

  //4
  def isNumberPrime(n: Int): Boolean = {
    def isPrimeUntil(m: Int): Boolean =
      if (m <= 1) true
      else n % m != 0 && isPrimeUntil(m - 1)

    isPrimeUntil(n / 2)
  }

  println(isNumberPrime(11))

}