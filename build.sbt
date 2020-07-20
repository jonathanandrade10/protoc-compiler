name := "compiler_proto"

version := "0.1"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  // https://mvnrepository.com/artifact/com.github.os72/protoc-jar
  "com.github.os72" % "protoc-jar" % "3.11.4"
)
