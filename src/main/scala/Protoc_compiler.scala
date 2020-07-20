object Protoc_compiler {
  def main(args: Array[String]): Unit = {
    val args = Array("-v3.11.4", "/tmp/person.proto", "--java_out=/tmp/proto, "--proto_path="/tmp/proto")
    //val args = Array("-v3.11.4","--help")

    import com.github.os72.protocjar.Protoc
    Protoc.runProtoc(args)

  }
}
