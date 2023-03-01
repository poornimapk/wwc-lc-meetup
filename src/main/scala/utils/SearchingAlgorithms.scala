package utils

object SearchingAlgorithms {
  def binarySearch(arr: Array[Int], numToSearch: Int): Boolean = {
    var low = 0
    var high = arr.length - 1
    var result = false
    while (low <= high && !result) {
      val middle = low + (high - low) / 2
      if(arr(middle) == numToSearch) result = true
      else if(arr(middle) > numToSearch) high = middle - 1
      else low = middle + 1
    }
    result
  }
}
