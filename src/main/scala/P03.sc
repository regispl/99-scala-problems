def nth[A](k: Int, xs: List[A]) : A = (k, xs) match {
  case (0, x :: _) => x
  case (k, _ :: tail) => nth(k - 1, tail)
  case (k, Nil) => throw new NoSuchElementException
}

nth(2, List(1, 1, 2, 3, 5, 8))