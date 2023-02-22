package easy

import scala.collection.mutable.HashMap

object TwoSum1 {
  def twoSumBrute(nums: Array[Int], target: Int): Array[Int] = {
    var myArr = Array[Int]()
    var i = 0
    var flag = false
    while (i < nums.length - 1 && !flag) {
      var j = i + 1
      while (j < nums.length && !flag) {
        if (nums(i) + nums(j) == target) {
          myArr = myArr :+ i
          myArr = myArr :+ j
          flag = true
        }
        j += 1
      }
      i += 1
    }
    myArr
  }

  def twoSumOptimized(nums: Array[Int], target: Int): Array[Int] = {
    val myMap = HashMap[Int, Int]()
    var i = 0
    var flag = false
    var index1, index2 = 0
    while (i < nums.length && !flag) {
      if (myMap.contains(target - nums(i)) && myMap(target - nums(i)) > -1) {
        index1 = myMap(target - nums(i))
        index2 = i
        flag = true
      } else myMap(nums(i)) = i
      i += 1
    }
    Array(index1, index2)
  }
}
