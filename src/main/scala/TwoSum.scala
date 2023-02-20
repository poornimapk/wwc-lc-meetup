import scala.collection.mutable.HashMap

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]
*/

object TwoSum {
  def twoSumBrute(nums: Array[Int], target: Int): Array[Int] = {
    var myArr = Array[Int]()
    var i = 0
    var flag = false
    while (i < nums.length - 1 && !flag) {
      var j = i + 1
      while(j < nums.length && !flag) {
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
    while(i < nums.length && !flag) {
      if(myMap.contains(target-nums(i)) && myMap(target-nums(i)) > -1) {
        index1 = myMap(target - nums(i))
        index2 = i
        flag = true
      } else myMap(nums(i)) = i
      i += 1
    }
    Array(index1, index2)
  }
}
