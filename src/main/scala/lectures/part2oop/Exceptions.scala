package lectures.part2oop

object Exceptions extends App {

  val x: String = null

  //  println(x.length)
  //  this ^^ will crash with a NPE

  // 1. throwing exceptions
  //  val aWeirdValue: String = throw new NullPointerException // also crashes

  // throwable classes extend the Throwable class.
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch exceptions

}
