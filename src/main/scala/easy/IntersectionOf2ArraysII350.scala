package easy

import scala.collection.mutable.HashMap

object IntersectionOf2ArraysII350 {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    if (nums1.length < nums2.length) intersect(nums2, nums1)
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
