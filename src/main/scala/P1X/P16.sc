def drop[A](n: Int, xs: List[A]): List[A] = {
  def dropRecursive[A](c: Int, xs: List[A], result: List[A]): List[A] = (c, xs) match {
    case (c, Nil) => result
    case (1, head :: tail) => dropRecursive(n, tail, result)
    case (_, head :: tail) => dropRecursive(c - 1, tail, result :+ head)
  }
  dropRecursive(n, xs, Nil)
}

def dropFunctional[A](n: Int, xs: List[A]): List[A] = {
  xs.zipWithIndex.filter(e => (e._2 + 1) % n != 0).map(_._1)
}

drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

dropFunctional(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))