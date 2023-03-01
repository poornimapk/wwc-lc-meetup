package utils

object SortingAlgorithms {
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
}
