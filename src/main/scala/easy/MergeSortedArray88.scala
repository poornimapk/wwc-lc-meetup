package easy

object MergeSortedArray88 {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Array[Int] = {
    val n1 = nums1.splitAt(m)._1

    val sorted = {
      if (n1.isEmpty && nums2.nonEmpty) nums2
      else if (n1.nonEmpty && nums2.isEmpty) n1
      else if (n1.isEmpty && nums2.isEmpty) n1
      else {
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

  def quickSort(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) arr
    else {
      val pivot = arr(arr.length / 2)
      Array.concat(
        quickSort(arr.filter(_ < pivot)),
        arr.filter(_ == pivot),
        quickSort(arr.filter(_ > pivot))
      )
    }
  }

  def mergeSortUsingQuickSort(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Array[Int] = {
    val n1 = nums1.splitAt(m)._1

    val sorted = (n1.isEmpty, nums2.isEmpty) match {
      case (true, false) => nums2
      case (false, true) => n1
      case (true, true) => n1
      case (false, false) => quickSort(n1 ++ nums2)
    }
    for (i <- sorted.indices) nums1(i) = sorted(i)
    nums1
  }
}
