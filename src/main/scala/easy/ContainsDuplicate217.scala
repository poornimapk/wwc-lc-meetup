package easy

import scala.collection.mutable.HashMap

object ContainsDuplicate217 {
  def containsDuplicateFn(nums: Array[Int]): Boolean = {
    var result = false

    for (i <- 0 to nums.length - 1) {
      for (j <- i + 1 to nums.length - 1) {
        if (nums(i) == nums(j)) result = true
      }
    }
    result
  }

  def containsDuplicateFnOptimized(nums: Array[Int]): Boolean = {
    val myMap = HashMap[Int, Int]()
    var result = false
    var i = 0
    while (i < nums.length && !result) {
      val num = nums(i)
      if (myMap.contains(num)) {
        result = true
      } else {
        myMap(num) = i
      }
      i += 1
    }
    result
  }

  def fromLC(nums: Array[Int]): Boolean = {
    val myMap = HashMap[Int, Int]()
    var result = false
    var i = 0
    while (i < nums.length && !result) {
      val num = nums(i)
      if (myMap.contains(num)) {
        result = true
      } else {
        myMap(num) = i
      }
      i += 1
    }
    result
  }

  def containsDuplicateFromLC(nums: Array[Int]): Boolean = {
    var result = false
    val myMap = HashMap[Int, Int]()
    var i = 0
    while (i < nums.length && !result) {
      val num = nums(i)
      if (myMap.contains(num)) result = true
      else myMap(num) = i
      i += 1
    }
    result
  }
}
