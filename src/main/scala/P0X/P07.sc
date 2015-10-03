def flatten(xs: List[Any]): List[Any] = xs flatMap {
  case ys: List[Any] => flatten(ys)
  case x => List(x)
}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))