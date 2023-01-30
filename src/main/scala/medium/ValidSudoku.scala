package medium

object ValidSudoku {
  val AllowedChars = Seq('1', '2', '3', '4', '5', '6', '7', '8', '9')
  def validCollection(cells: List[Char]): Boolean = {
    val filledCells = cells.filter(_ != '.')
    filledCells.isEmpty || (filledCells.distinct.size == filledCells.size &&
                            filledCells.forall(AllowedChars.contains(_)))
  }
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    import util.control.Breaks._
    def getSubBoxes(row: Int, col: Int): List[Char] =
      (0 until 3).toList.flatMap(r =>
        (0 until 3).toList.map { c =>
          board(row + r)(col + c)
        })
    var res = true
    breakable {
      0 until 9 foreach { row =>
        0 until 9 foreach { col =>
          List(board(row).toList, board.toList.map(_ (col)),
            getSubBoxes(3 * (row / 3), 3 * (col / 3))).foldLeft(true) {
            case (valid, collection) => if (!valid) {
              res = false
              break
            } else{
              if (validCollection(collection)) true else {
                res = false
                break
              }
            }
          }
        }
      }
    }
    res
  }
}

/*
object Solution {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val existing = collection.mutable.HashSet.empty[String]
    for (x <- 0 until 9) {
      for (y <- 0 until 9) {
        val current = board(x)(y)
        if (current != '.') {
          val row = "n" + current + "r" + x
          val column = "n" + current + "c" + y
          val block = "n" + current + "b" + x / 3 + "-" + y / 3
          if (!existing.add(row) || !existing.add(column) || !existing.add(block)) {
            return false
          }
        }
      }
    }
    true
  }
}*/
