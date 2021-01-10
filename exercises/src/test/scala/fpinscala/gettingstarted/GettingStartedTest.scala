package fpinscala.gettingstarted

import fpinscala.gettingstarted.PolymorphicFunctions.{curry, isSorted}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class GettingStartedTest extends AnyWordSpec with Matchers {
  "PolymorphicFunctions" should {
    "isSorted" which {
      "true for sorted array" in {
        isSorted[Int](Array(1, 2, 3, 4), _ > _) shouldBe true
      }
      "false for unsorted array" in {
        isSorted[Int](Array(2, 1, 3, 4), _ > _) shouldBe false
      }
    }
    "curry" which {
      "returns correctly curried function" in {
        val result = curry[Int, Int, Int](_ + _)
        result shouldBe a[Int => Int => Int]
        result(1)(2) shouldBe 3
      }
    }
  }
}
