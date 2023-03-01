// generate array random positive integers
// take that array find 2 largest integers
// calculate GCD(Greatest common denominator) of the two largest integers

package easy

import scala.util.Random

object GreatestCommonDivisor extends App {
  private def generateRandomInts: Array[Int] =
    (1 to 10).collect(i => Random.between(1, 100)).toArray

  private def divisors(num: Int): Array[Option[Int]] =
    (1 to num).collect(i => if (num % i == 0) Some(i) else None).toArray

  def findGreatestCommonDenominatorRandom: Int = {
    val sortedReversedRandomNums = generateRandomInts.sorted.reverse
    val num1 = sortedReversedRandomNums(0)
    val num2 = sortedReversedRandomNums(1)
    println(s"num1: $num1, num2: $num2")
    val num1Divisors = divisors(num1).sorted.flatten
    val num2Divisors = divisors(num2).sorted.flatten
    num1Divisors.intersect(num2Divisors).sorted.reverse(0)
  }

  println(findGreatestCommonDenominatorRandom)

  def findGreatestCommonDenominator(x: Int, y: Int): Int = {
    val xDivisors = divisors(x).sorted.flatten
    val yDivisors = divisors(y).sorted.flatten
    xDivisors.intersect(yDivisors).sorted.reverse(0)
  }

  println(findGreatestCommonDenominator(54, 24))
}
