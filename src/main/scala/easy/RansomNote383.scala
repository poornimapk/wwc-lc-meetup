/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

  Input: ransomNote = "a", magazine = "b"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/

package easy

import scala.collection.mutable.HashMap

object RansomNote383 {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    if(magazine.length < ransomNote.length) return false
    val charMapRN = HashMap[Char, Int]()
    for(i <- 0 until ransomNote.length)
      if(charMapRN.contains(ransomNote(i))) charMapRN(ransomNote(i)) += 1
      else charMapRN(ransomNote(i)) = 1
    for((letter, count) <- charMapRN) {
      if(magazine.count(let => let == letter) < count) return false
    }
    true
  }
}
