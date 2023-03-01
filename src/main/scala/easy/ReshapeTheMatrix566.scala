/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

  If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 */

package easy

/*object ReshapeTheMatrix566 {
  def matrixReshape(mat: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
    val totalMatLen = mat.flatten.length
    val totalOutputMatLen = r * c

  }
}*/

object ForComprehension extends App {
  val totalResults = List(TestResults("1", 5, 5), TestResults("2", 6, 6))
  val listOfSuccessfulResultsCount: List[Int] =
    for {
      result <- totalResults
      if (result.succeeded)
    } yield result.successfulTests

  val totalSuccessfulResults = listOfSuccessfulResultsCount.sum
  println(totalSuccessfulResults)
}

case class TestResults(id: String, successfulTests: Int, totalTests: Int) {
  def succeeded = successfulTests == totalTests
}
