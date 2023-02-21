/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
  The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
  The result of the merge is [1].

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
  The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.*/

object MergeSortedArray {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Array[Int] = {
    val n1 = nums1.splitAt(m)._1

    val sorted = {
      if(n1.isEmpty && nums2.nonEmpty) nums2
      else if(n1.nonEmpty && nums2.isEmpty) n1
      else if(n1.isEmpty && nums2.isEmpty) n1
      else {
        val mergedArr = n1 ++ nums2
        for(i <- 0 until  mergedArr.length) {
          for(j <- 0 until  mergedArr.length - i - 1) {
            if(mergedArr(j) > mergedArr(j+1)) {
              val temp = mergedArr(j)
              mergedArr(j) = mergedArr(j+1)
              mergedArr(j+1) = temp
            }
          }
        }
        mergedArr
      }
    }
    for(i <- sorted.indices)  nums1(i) = sorted(i)
    nums1
  }

  def mergeAnotherApproach(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Array[Int] = {
    val n1 = nums1.splitAt(m)._1

    val sorted = (n1.isEmpty, nums2.isEmpty) match {
      case (true, false) => nums2
      case (false, true) => n1
      case (true, true) => n1
      case (false, false) => {
        val mergedArr = n1 ++ nums2
        for (i <- 0 until mergedArr.length) {
          for (j <- 0 until mergedArr.length - i - 1) {
            if (mergedArr(j) > mergedArr(j + 1)) {
              val temp = mergedArr(j)
              mergedArr(j) = mergedArr(j + 1)
              mergedArr(j + 1) = temp
            }
          }
        }
        mergedArr
      }
    }
    for (i <- sorted.indices) nums1(i) = sorted(i)
    nums1
  }
}
