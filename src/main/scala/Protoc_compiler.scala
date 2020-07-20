object Protoc_compiler {
  def main(args: Array[String]): Unit = {
    val args = Array("-v3.11.4", "src/main/proto/person.proto", "--java_out=src/main/proto/", "--proto_path=src/main/proto/")
    //val args = Array("-v3.11.4","--help")

    import com.github.os72.protocjar.Protoc
    Protoc.runProtoc(args)

  }
}
