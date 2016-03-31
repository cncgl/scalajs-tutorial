package tutorial.webapp

import utest._
import org.scalajs.jquery.jQuery
import utest.framework.{Test, Tree}

object TutorialTest extends TestSuite {
  // Initialize App
  TutorialApp.setupUI()

//  def test = TestSuite {
//    'HelloWorld {
//      assert(jQuery("p:contains('Hello World')").length == 1)
//    }
//  }

  override def tests: Tree[Test] = TestSuite {
    'HelloWorld {
      assert(jQuery("p:contains('Hello World')").length == 1)
    }
  }
}
