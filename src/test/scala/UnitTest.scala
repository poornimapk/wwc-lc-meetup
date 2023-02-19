import org.scalatest.funsuite._
class UnitTest extends AnyFunSuite {
  test("ContainsDuplicateOptimized") {
    assert(ContainsDuplicate.containsDuplicateFnOptimized(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate.containsDuplicateFnOptimized(Array(1, 2, 3, 4)) === false)
    assert(ContainsDuplicate.containsDuplicateFnOptimized(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }
  test("ContainsDuplicateFromLC") {
    assert(ContainsDuplicate.containsDuplicateFromLC(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate.containsDuplicateFromLC(Array(1, 2, 3, 4)) === false)
    assert(ContainsDuplicate.containsDuplicateFromLC(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }

  test("TwoSumBruteForce") {
    assert(TwoSum.twoSumBrute(Array(2,7,11,15), 9) === Array(0, 1))
    assert(TwoSum.twoSumBrute(Array(3, 2, 4), 6) === Array(1, 2))
    assert(TwoSum.twoSumBrute(Array(3, 3), 6) === Array(0, 1))
  }
}
