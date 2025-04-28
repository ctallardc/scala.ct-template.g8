package example

import myutils._

object Hello extends Greeting with App {
  println(greeting)
  println(Lists.sum(List(1,3,2,8)))

}

trait Greeting {
  lazy val greeting: String = "hello"
}
