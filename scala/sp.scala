object Pyramid {
  def printPyramid(height: Int): Unit = {
    for(i <- 1 to height){
      // print spaces
      for(j <- 1 to height){
        print(" ")
      }

      //Print stars
      for(k<-1 to 2*i-1){
        print("*")
      }

      // Move to the next line
      println()
    }
  }

  def main(args: Array[String]): Unit = {
    val height = 5 // Change the height of the pyramid as needed
    printPyramid(height)
  }
}