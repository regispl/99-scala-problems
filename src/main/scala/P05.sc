def reverse[A](xs: List[A]): List[A] = {
  def reverseRecursive[A](rev: List[A], xs: List[A]): List[A] = xs match {
    case Nil => rev
    case x :: tail => reverseRecursive(x :: rev, tail)
  }
  reverseRecursive(Nil, xs)
}

reverse(List(1, 1, 2, 3, 5, 8))
