def isPalindrome[A](xs: List[A]): Boolean = {
  xs == xs.reverse
}

isPalindrome(List(1, 2, 3, 2, 1))
