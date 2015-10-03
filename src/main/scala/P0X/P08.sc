def compress[A](xs: List[A]): List[A] = {
  def compressRecursive[A](c: List[A], xs: List[A]): List[A] = xs match {
    case Nil => c.reverse
    case x :: tail => compressRecursive(x :: c, tail.dropWhile(_ == x))
  }
  compressRecursive(Nil, xs)
}
def compressFold[A](xs: List[A]): List[A] = {
  xs.foldLeft(List[A]()) { (r, c) =>
    if(r.isEmpty || r.last != c) r :+ c
    else r
  }
}
compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
compressFold(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))