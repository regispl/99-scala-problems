def rotate[A](n: Int, xs: List[A]): List[A] = {
  val nBounded = if (xs.isEmpty) 0 else n % xs.length
  if (nBounded < 0) rotate(xs.length + nBounded, xs)
  else xs.drop(nBounded) ::: xs.take(nBounded)
}

rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))