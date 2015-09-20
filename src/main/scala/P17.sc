def split[A](n: Int, xs: List[A]): (List[A], List[A]) = {
  def splitRecursive[A](c: Int, xs: List[A], pre: List[A]): (List[A], List[A]) = (c, xs) match {
    case (_, Nil) => (pre, Nil)
    case (0, l) => (pre, l)
    case (n, head :: tail) => splitRecursive(c - 1, tail, pre :+ head)
  }
  splitRecursive(n, xs, Nil)
}

split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))