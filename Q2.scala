object Q2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer argument.")
      System.exit(1)
    }

    try {
      val number = args(0).toInt

      // Define lambda functions for checks
      val isMultipleOf3: Int => Boolean = _ % 3 == 0
      val isMultipleOf5: Int => Boolean = _ % 5 == 0

      // Pattern matching
      val result = number match {
        case n if isMultipleOf3(n) && isMultipleOf5(n) => "Multiple of Both Three and Five"
        case n if isMultipleOf3(n) => "Multiple of Three"
        case n if isMultipleOf5(n) => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
      }

      println(result)

    } catch {
      case _: NumberFormatException =>
        println("Please provide a valid integer.")
    }
  }
}