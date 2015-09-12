def pack[A](xs: List[A]): List[List[A]] = {
  if(xs.isEmpty) List(List())
  else {
    val (packed, next) = xs span { _ == xs.head }
    if(next == Nil) List(packed)
    else packed :: pack(next)
  }
}

def encode[A](xs: List[A]): List[(Int, A)] =
  pack(xs).map { e => (e.length, e.head) }

def encodeModified[A](xs: List[A]): List[Any] =
  encode(xs).map { e => if(e._1 == 1) e._2 else e }

encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))