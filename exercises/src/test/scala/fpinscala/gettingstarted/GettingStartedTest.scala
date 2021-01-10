package fpinscala.gettingstarted

import fpinscala.gettingstarted.PolymorphicFunctions.{compose, curry, isSorted, uncurry}
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
    "uncurry" which {
      "reverses curry" in {
        val f      = (i: Int, j: Int) => i + j
        val result = uncurry(curry(f))
        result shouldBe a[(Int, Int) => Int]
        result(1, 2) shouldBe 3

      }
    }
    "compose" which {
      "combines two functions" in {
        val f      = (i: Int) => i.toString
        val g      = (s: String) => s.length
        val result = compose(g, f)
        result(1234) shouldBe 4
      }
    }
  }
}
