/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



  Example 1:

  Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.*/

import scala.collection.mutable.HashMap

object IntersectionOf2ArraysII350 {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    if(nums1.length < nums2.length) intersect(nums2, nums1)
    else {
      val myMap = HashMap[Int, Int]()
      nums1.foreach(num => myMap(num) = myMap.get(num).getOrElse(0) + 1)
      var result = Array[Int]()
      for (num <- nums2) {
        if (myMap.contains(num) && myMap(num) > 0) {
          result = result :+ num
          myMap(num) = myMap(num) - 1
        }
      }
      result
    }
  }
}