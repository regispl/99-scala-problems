def slice[A](from: Int, to: Int, xs: List[A]): List[A] = {
  def sliceRecursive(c: Int, xs: List[A], result: List[A]): List[A] = (c, xs) match {
    case (_, Nil) => result
    case (c, head :: tail) if to <= c => result
    case (c, head :: tail) if from <= c => sliceRecursive(c + 1, tail, result :+ head)
    case (c, head :: tail) => sliceRecursive(c + 1, tail, Nil)
  }
  sliceRecursive(0, xs, Nil)
}

slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))