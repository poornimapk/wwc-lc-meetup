package easy

object ValidPalindrome125 {
  def isPalindrome(s: String): Boolean = {
    checkPalindrome(s.replaceAll("[^a-zA-Z0-9]", ""))
  }

  def checkPalindrome(s: String): Boolean = {
    val leftIndexEnd = (s.length / 2) - 1
    var rightIndexEnd = 0
    if (s.length % 2 == 0) {
      rightIndexEnd = leftIndexEnd + 1
    } else {
      rightIndexEnd = leftIndexEnd + 2
    }
    var result = true
    var i = 0
    var j = s.length - 1
    while (result && i <= leftIndexEnd && j >= rightIndexEnd) {
      if (s(i).toLower != s(j).toLower) result = false
      i += 1
      j -= 1
    }
    result
  }

  def isPalindromeOptimized(s: String): Boolean = {
    var result = true
    val trimmedStr = s.replaceAll("[^a-zA-Z0-9]", "")
    var leftIndex = 0
    var rightIndex = trimmedStr.length - 1
    while (leftIndex < rightIndex) {
      if(trimmedStr(leftIndex).toLower != trimmedStr(rightIndex).toLower) result = false
      leftIndex += 1
      rightIndex -= 1
    }
    result
  }
}
