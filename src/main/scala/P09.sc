def pack[A](xs: List[A]): List[List[A]] = {
  def packRecursive[A](c: List[List[A]], xs: List[A]): List[List[A]] = xs match {
    case Nil => c
    case x :: tail => packRecursive(
        c :+ (x :: tail.takeWhile(_ == x)),
        tail.dropWhile(_ == x)
      )
  }
  packRecursive(Nil, xs)
}

pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))