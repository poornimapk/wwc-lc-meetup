package medium
import utils._

object SearchA2DMatrix74 {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    var result = false
    var outerArrIndex = 0
    while(outerArrIndex < matrix.length && !result) {
      result = SearchingAlgorithms.binarySearch(matrix(outerArrIndex), target)
      outerArrIndex += 1
    }
    result
  }
}
