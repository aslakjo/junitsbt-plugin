package junitsbtplugin

import sbt._
import sbt.TestFramework

trait JUnit extends DefaultProject {
  lazy val bryanjswift = "Bryan J Swift Repository" at "http://repos.bryanjswift.com/maven2/"
  lazy val junitInterface = "com.novocode" % "junit-interface" % "0.4.0" % "test"

  override def testFrameworks = super.testFrameworks ++ List(new TestFramework("com.novocode.junit.JUnitFrameworkNoMarker"))
}

