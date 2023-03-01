package easy

import scala.collection.mutable.ListBuffer

object PascalsTriangle118 extends App {
  def generate(numRows: Int): List[List[Int]] = {
    val res = ListBuffer[List[Int]]()
    for(r <- 0 until  numRows) {
      val row = ListBuffer.empty[Int]
      for(c <- 0 until  r + 1) {
        row.addOne(calculate(c, r))
      }
      res.addOne(row.toList)
    }
    res.toList
  }

  def calculate(col: Int, row: Int): Int = {
    if(row == 0 || col == 0 || row == col) 1
    else calculate(col, row - 1) + calculate(col - 1, row -1)
  }
}