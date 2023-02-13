object IR extends squid.ir.SimpleAST
import IR.Predef._

object Main {
  def main(args: Array[String]): Unit = {
    println("Squid Playground")
    // const expression
    val const_expr = Const(42)
    println(const_expr)
  }
}