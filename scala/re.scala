object RecursionExample {
  def factorial(n: Int): Int = {
    if(n==0||n==1) 1 // base case: factorial of 0 or 1 is 1
    else n*factorial(n-1) // recursive call for n > 1
  }

  def main(args: Array[String]): Unit = {
    val num = 5 // Calculate factorial of 5
    val result = factorial(num)
    println(s"Factorial of $num is: $result")
  }
}