package fpinscala.datastructures

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ListTest extends AnyWordSpec with Matchers {
  "List" should {
    "x" which { "is equal to x + y" in { List.x shouldBe 3 } }
  }
}
