package fpinscala.datastructures

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ListTest extends AnyWordSpec with Matchers {

  private val provide = afterWord("provide")

  "List" should provide {

    // Ex 3.1
    "x" which {
      "provides right answer" in { List.x shouldBe 3 }
    }

    // Ex 3.2
    "tail" which {
      "removes first element from list" in { List.tail(Cons(1, Cons(2, Nil))) shouldBe Cons(2, Nil) }
      "throws RuntimeException for empty list" in { assertThrows[RuntimeException](List.tail(Nil)) }
    }

    // Ex 3.3
    "setHead" which {
      "replaces the first element with different value" in {
        List.setHead(Cons(1, Nil), 2) shouldBe Cons(2, Nil)
      }
      "throws RuntimeException for empty list" in { assertThrows[RuntimeException](List.setHead(Nil, 1)) }
    }
  }
}
