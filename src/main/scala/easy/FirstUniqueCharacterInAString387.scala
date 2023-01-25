/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Input: s = "leetcode"
Output: 0
Input: s = "loveleetcode"
Output: 2
Input: s = "aabb"
Output: -1
*/

package easy

import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

object FirstUniqueCharacterInAString387 {
  def firstUniqChar(s: String): Int = {
    val charMap = HashMap[Char, ArrayBuffer[Int]]()
    for(i <- 0 until s.length) {
      if(charMap.contains(s(i))) charMap(s(i)) += i
      else charMap(s(i)) = ArrayBuffer[Int](i)
    }
    var res = -1
    for(i <- 0 until s.length) {
      if(charMap(s(i)).length == 1) return charMap(s(i))(0)
    }
    res
  }
}
