import org.scalatest.funsuite._
class UnitTest extends AnyFunSuite {
  test("ContainsDuplicateOptimized") {
    assert(ContainsDuplicate217.containsDuplicateFnOptimized(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate217.containsDuplicateFnOptimized(Array(1, 2, 3, 4)) === false)
    assert(ContainsDuplicate217.containsDuplicateFnOptimized(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }
  test("ContainsDuplicateFromLC") {
    assert(ContainsDuplicate217.containsDuplicateFromLC(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate217.containsDuplicateFromLC(Array(1, 2, 3, 4)) === false)
    assert(ContainsDuplicate217.containsDuplicateFromLC(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }

  test("TwoSumBruteForce") {
    assert(TwoSum1.twoSumBrute(Array(2,7,11,15), 9) === Array(0, 1))
    assert(TwoSum1.twoSumBrute(Array(3, 2, 4), 6) === Array(1, 2))
    assert(TwoSum1.twoSumBrute(Array(3, 3), 6) === Array(0, 1))
  }

  test("TwoSumOptimized") {
    assert(TwoSum1.twoSumOptimized(Array(2, 7, 11, 15), 9) === Array(0, 1))
    assert(TwoSum1.twoSumOptimized(Array(3, 2, 4), 6) === Array(1, 2))
    assert(TwoSum1.twoSumOptimized(Array(3, 3), 6) === Array(0, 1))
  }

  test("MergeSortedArray") {
    assert(MergeSortedArray88.merge(Array(1,2,3,0,0,0), 3, Array(2,5,6), 3) === Array(1,2,2,3,5,6))
    assert(MergeSortedArray88.merge(Array(1), 1, Array.emptyIntArray, 0) === Array(1))
    assert(MergeSortedArray88.merge(Array[Int](0), 0, Array(1), 1) === Array(1))
  }

  test("MergeSortedArrayAnotherApproach") {
    assert(MergeSortedArray88.mergeAnotherApproach(Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3) === Array(1, 2, 2, 3, 5, 6))
    assert(MergeSortedArray88.mergeAnotherApproach(Array(1), 1, Array.emptyIntArray, 0) === Array(1))
    assert(MergeSortedArray88.mergeAnotherApproach(Array[Int](0), 0, Array(1), 1) === Array(1))
  }

  test("QuickSort") {
    assert(MergeSortedArray88.quickSort(Array(2, 0, 2, 1, 1, 0)) === Array(0, 0, 1, 1, 2, 2))
  }

  test("MergeSortedUsingQuickSort") {
    assert(MergeSortedArray88.mergeSortUsingQuickSort(Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3) === Array(1, 2, 2, 3, 5, 6))
    assert(MergeSortedArray88.mergeSortUsingQuickSort(Array(1), 1, Array.emptyIntArray, 0) === Array(1))
    assert(MergeSortedArray88.mergeSortUsingQuickSort(Array[Int](0), 0, Array(1), 1) === Array(1))
  }

  test("IntersectionOf2ArraysII") {
    assert(IntersectionOf2ArraysII350.intersect(Array(1,2,2,1), Array(2,2)) === Array(2, 2))
    assert(IntersectionOf2ArraysII350.intersect(Array(4, 9, 5), Array(9,4,9,8,4)) === Array(4, 9))
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
}
