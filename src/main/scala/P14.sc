def duplicate[A](xs: List[A]): List[A] = {
  xs.flatMap(List.fill(2)(_))
}

duplicate(List('a, 'b, 'c, 'c, 'd))