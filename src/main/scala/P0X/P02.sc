def penultimate[A](xs: List[A]) : A = xs match {
  case x :: y :: Nil => x
  case _ :: tail => penultimate(tail)
  case _ => throw new NoSuchElementException
}

penultimate(List(1, 1, 2, 3, 5, 8))