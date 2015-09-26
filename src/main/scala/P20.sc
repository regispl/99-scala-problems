def removeAt[A](n: Int, xs: List[A]): (A, List[A]) = (n, xs) match {
  case (0, Nil) => throw new NoSuchElementException
  case (0, head :: tail) => (h, tail)
  case (_, head :: tail) => {
    val (r, ls) = removeAt(n-1, tail)
    (r, head :: ls)
  }
}

removeAt(1, List('a, 'b, 'c, 'd))