def insertAt[A](x: A, n: Int, xs: List[A]): List[A] = (n, xs) match {
  case (_, Nil) => throw new NoSuchElementException
  case (0, ls) => x +: ls
  case (_, head :: tail) => {
    val l = insertAt(x, n-1, tail)
    head :: l
  }
}

insertAt('new, 1, List('a, 'b, 'c, 'd))