def length[A](xs: List[A]) : Int = {
  def lengthRecursive(len: Int, xs: List[A]) : Int = xs match {
    case Nil => len
    case _ :: tail => lengthRecursive(len + 1, tail)
  }
  lengthRecursive(0, xs)
}


length(List(1, 1, 2, 3, 5, 8))