package example

class HelloSpec extends munit.FunSuite {
  test("say hello") {
    assertEquals(Hello.greeting, "hello")
  }
  test("one plus one is two")(assert(1 + 1 == 2))

  test("intNotZero throws an exception if its argument is 0") {
    intercept[IllegalArgumentException] {
      intNotZero(0)
    }
  }
  def intNotZero(x: Int): Int = {
    if (x == 0) throw new IllegalArgumentException("zero is not allowed")
    else x
  }


import myutils._

test("sum of a few numbers") {
    assert(Lists.sum(List(1,2,0)) == 3)
  }
  
  test("max of a few numbers") {
    assert(Lists.sum(List(1,2,0)) == 3)
    assert(Lists.max(List(3, 7, 2)) == 7)
  }
  
   test("max of Empty") {
     intercept[NoSuchElementException] {
    	 Lists.max(List())
     }
  }
  

}
