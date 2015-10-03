import java.util.NoSuchElementException

def last[A](xs: List[A]) : A = xs match {
  case x :: Nil => x
  case _ :: tail => last(tail)
  case _ => throw new NoSuchElementException
}

last(List(1, 1, 2, 3, 5, 8))