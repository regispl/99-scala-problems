def range(min: Int, max: Int): List[Int] = {
  def rangeRecursive(c: Int, result: List[Int]): List[Int] = {
    if (c < min) result
    else rangeRecursive(c - 1, c :: result)
  }
  rangeRecursive(max, Nil)
}

range(4, 9)