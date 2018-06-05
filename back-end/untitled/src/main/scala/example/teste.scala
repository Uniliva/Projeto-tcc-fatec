
trait Lambda {
  val l = "Lambda"
}
trait Calculus {
  this: Lambda =>
  val c = "Calculus"
  val lc = l + c
}