import scala.collection.mutable.HashMap

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true
Input: s = "rat", t = "car"
Output: false
*/


object ValidAnagram242 {
  def isAnagram(s: String, t: String): Boolean = {
    var result = true
    if(s.length != t.length) result = false
    else {
      val myMap = HashMap[Char, Int]()
      def addToMap(c: Char) = myMap(c) = myMap.getOrElse(c, 0) + 1
      s.foreach(c => addToMap(c))
      def checkInMap(c: Char): Boolean = myMap.get(c) match {
        case None => false
        case Some(count) => myMap(c) = count - 1; true
      }
      result = t.forall(checkInMap) && myMap.forall {
        case (key, value) => value == 0
      }
    }
    result
  }

  def isAnagram2(s: String, t: String): Boolean = {
    val countS = HashMap[Char, Int]()
    val countT = HashMap[Char, Int]()
    if (s.length != t.length) return false
    for (i <- 0 until s.length) {
      countS(s(i)) = countS.getOrElse(s(i), 0) + 1
      countT(t(i)) = countT.getOrElse(t(i), 0) + 1
    }
    for (c <- countS.keySet) {
      if (countS(c) != countT.getOrElse(c, 0)) return false
    }
    true
  }
}
