import easy.{
  BestTimeToBuyAndSellStock121,
  ContainsDuplicate217,
  IntersectionOf2ArraysII350,
  MergeSortedArray88,
  TwoSum1,
  ValidPalindrome125,
  ReshapeTheMatrix566,
  GreatestCommonDivisor,
  PascalsTriangle118,
  FirstUniqueCharacterInAString387,
}
import medium.{
  SearchA2DMatrix74,
  MaximumSubarray53,
}
import utils.{
  SearchingAlgorithms,
  SortingAlgorithms,
}

import org.scalatest.funsuite._
class UnitTest extends AnyFunSuite {
  test("ContainsDuplicateOptimized") {
    assert(ContainsDuplicate217.containsDuplicateFnOptimized(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate217.containsDuplicateFnOptimized(Array(1, 2, 3, 4)) === false)
    assert(
      ContainsDuplicate217
        .containsDuplicateFnOptimized(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }
  test("ContainsDuplicateFromLC") {
    assert(ContainsDuplicate217.containsDuplicateFromLC(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate217.containsDuplicateFromLC(Array(1, 2, 3, 4)) === false)
    assert(
      ContainsDuplicate217.containsDuplicateFromLC(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }

  test("TwoSumBruteForce") {
    assert(TwoSum1.twoSumBrute(Array(2, 7, 11, 15), 9) === Array(0, 1))
    assert(TwoSum1.twoSumBrute(Array(3, 2, 4), 6) === Array(1, 2))
    assert(TwoSum1.twoSumBrute(Array(3, 3), 6) === Array(0, 1))
  }

  test("TwoSumOptimized") {
    assert(TwoSum1.twoSumOptimized(Array(2, 7, 11, 15), 9) === Array(0, 1))
    assert(TwoSum1.twoSumOptimized(Array(3, 2, 4), 6) === Array(1, 2))
    assert(TwoSum1.twoSumOptimized(Array(3, 3), 6) === Array(0, 1))
  }

  test("MergeSortedArray") {
    assert(
      MergeSortedArray88.merge(Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3) === Array(1, 2, 2, 3,
        5, 6))
    assert(MergeSortedArray88.merge(Array(1), 1, Array.emptyIntArray, 0) === Array(1))
    assert(MergeSortedArray88.merge(Array[Int](0), 0, Array(1), 1) === Array(1))
  }

  test("MergeSortedArrayAnotherApproach") {
    assert(
      MergeSortedArray88
        .mergeAnotherApproach(Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3) === Array(1, 2, 2, 3,
        5, 6))
    assert(
      MergeSortedArray88.mergeAnotherApproach(Array(1), 1, Array.emptyIntArray, 0) === Array(1))
    assert(MergeSortedArray88.mergeAnotherApproach(Array[Int](0), 0, Array(1), 1) === Array(1))
  }

  test("QuickSort") {
    assert(MergeSortedArray88.quickSort(Array(2, 0, 2, 1, 1, 0)) === Array(0, 0, 1, 1, 2, 2))
  }

  test("MergeSortedUsingQuickSort") {
    assert(
      MergeSortedArray88
        .mergeSortUsingQuickSort(Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3) === Array(1, 2, 2,
        3, 5, 6))
    assert(
      MergeSortedArray88.mergeSortUsingQuickSort(Array(1), 1, Array.emptyIntArray, 0) === Array(1))
    assert(MergeSortedArray88.mergeSortUsingQuickSort(Array[Int](0), 0, Array(1), 1) === Array(1))
  }

  test("IntersectionOf2ArraysII") {
    assert(IntersectionOf2ArraysII350.intersect(Array(1, 2, 2, 1), Array(2, 2)) === Array(2, 2))
    assert(
      IntersectionOf2ArraysII350.intersect(Array(4, 9, 5), Array(9, 4, 9, 8, 4)) === Array(4, 9))
    assert(IntersectionOf2ArraysII350.intersect(Array(1, 2), Array(1, 1)) === Array(1))
  }

  test("BestTimeToBuyAndSellStock121") {
    assert(BestTimeToBuyAndSellStock121.maxProfitBruteForce(Array(7, 1, 5, 3, 6, 4)) === 5)
    assert(BestTimeToBuyAndSellStock121.maxProfitBruteForce(Array(7, 6, 4, 3, 1)) === 0)
  }

  test("BestTimeToBuyAndSellStock121Optimized") {
    assert(BestTimeToBuyAndSellStock121.maxProfitOptimized(Array(7, 1, 5, 3, 6, 4)) === 5)
    assert(BestTimeToBuyAndSellStock121.maxProfitOptimized(Array(7, 6, 4, 3, 1)) === 0)
  }

  test("MaximumSubarray53") {
    assert(MaximumSubarray53.maxSubArrayKadanesAlgo(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) === 6)
    assert(MaximumSubarray53.maxSubArrayKadanesAlgo(Array(1)) === 1)
    assert(MaximumSubarray53.maxSubArrayKadanesAlgo(Array(5, 4, -1, 7, 8)) === 23)
    assert(MaximumSubarray53.maxSubArrayKadanesAlgo(Array(-1, -2, -3, -4, -5)) === -1)
  }

  test("ValidAnagram") {
    assert(ValidAnagram242.isAnagram("anagram", "nagaram") === true)
    assert(ValidAnagram242.isAnagram("rat", "car") === false)
    assert(ValidAnagram242.isAnagram("brush", "shrub") === true)
    assert(ValidAnagram242.isAnagram("angered", "enraged") === true)
    assert(ValidAnagram242.isAnagram("hello", "world") === false)
    assert(ValidAnagram242.isAnagram("hellos", "world") === false)
  }

  test("ValidAnagram2") {
    assert(ValidAnagram242.isAnagram2("anagram", "nagaram") === true)
    assert(ValidAnagram242.isAnagram2("rat", "car") === false)
    assert(ValidAnagram242.isAnagram2("brush", "shrub") === true)
    assert(ValidAnagram242.isAnagram2("angered", "enraged") === true)
    assert(ValidAnagram242.isAnagram2("hello", "world") === false)
    assert(ValidAnagram242.isAnagram2("hellos", "world") === false)
  }

  test("ValidPalindrome") {
    assert(ValidPalindrome125.isPalindrome("A man, a plan, a canal: Panama") === true)
    assert(ValidPalindrome125.isPalindrome("race a car") === false)
    assert(ValidPalindrome125.isPalindrome(" ") === true)
    assert(ValidPalindrome125.isPalindrome("0P") === false)
    assert(ValidPalindrome125.isPalindrome("malayalam") === true)
    assert(ValidPalindrome125.isPalindrome("amma") === true)
    assert(ValidPalindrome125.isPalindrome("car") === false)
    assert(ValidPalindrome125.isPalindrome("cars") === false)
  }

  test("ValidPalindromeOptimized") {
    assert(ValidPalindrome125.isPalindromeOptimized("A man, a plan, a canal: Panama") === true)
    assert(ValidPalindrome125.isPalindromeOptimized("race a car") === false)
    assert(ValidPalindrome125.isPalindromeOptimized(" ") === true)
    assert(ValidPalindrome125.isPalindromeOptimized("0P") === false)
    assert(ValidPalindrome125.isPalindromeOptimized("malayalam") === true)
    assert(ValidPalindrome125.isPalindromeOptimized("amma") === true)
    assert(ValidPalindrome125.isPalindromeOptimized("car") === false)
    assert(ValidPalindrome125.isPalindromeOptimized("cars") === false)
  }

  test("ReshapeTheMatrix") {
    assert(
      ReshapeTheMatrix566
        .matrixReshape(Array(Array(1, 2), Array(3, 4)), 1, 4) === Array(Array(1, 2, 3, 4)))
    assert(ReshapeTheMatrix566
      .matrixReshape(Array(Array(1, 2), Array(3, 4)), 2, 4) === Array(Array(1, 2), Array(3, 4)))

  }

  test("GreatestCommonDivisor" ) {
    assert(GreatestCommonDivisor.findGreatestCommonDenominator(54, 24) === 6)
    assert(GreatestCommonDivisor.findGreatestCommonDenominator(8, 12) === 4)
  }

  test("PascalsTriangle") {
    assert(PascalsTriangle118.generate(5) === List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1), List(1, 4, 6, 4, 1)))
    assert(PascalsTriangle118.generate(1) === List(List(1)))
  }

  test("Search2DMatrix") {
    assert(SearchA2DMatrix74.searchMatrix(Array(Array(1,3,5,7), Array(10,11,16,20), Array(23,30,34,60)), 3) === true)
    assert(SearchA2DMatrix74.searchMatrix(Array(Array(1,3,5,7), Array(10,11,16,20), Array(23,30,34,60)), 13) === false)
  }

  test("SearchingAlgorithms") {
    assert(SearchingAlgorithms.binarySearch(Array(1,3,5,7), 3) === true)
    assert(SearchingAlgorithms.binarySearch(Array(1,3,5,7), 13) === false)
  }

  test("FirstUniqueCharInAStr") {
    assert(FirstUniqueCharacterInAString387.firstUniqChar("leetcode") === 0)
    assert(FirstUniqueCharacterInAString387.firstUniqChar("loveleetcode") === 2)
    assert(FirstUniqueCharacterInAString387.firstUniqChar("aabb") === -1)
    assert(FirstUniqueCharacterInAString387.firstUniqChar("aabbccfft") === 8)
    assert(FirstUniqueCharacterInAString387.firstUniqChar("aabbccfftgggwwwu") === 8)
  }
}
