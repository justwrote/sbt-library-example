name := "sbt-library-example"

scalaVersion := "2.9.0"

libraryDependencies += "this_library_does" %% "not_exist1" % "1.2.3"

externalPom()

libraryDependencies += "this_library_does" %% "not_exist2" % "1.2.3"
