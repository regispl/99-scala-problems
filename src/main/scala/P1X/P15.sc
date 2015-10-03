def duplicateN[A](n: Int, xs: List[A]): List[A] = {
  xs.flatMap(List.fill(n)(_))
}

duplicateN(3, List('a, 'b, 'c, 'c, 'd))