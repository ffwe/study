package main
import (
"fmt"
"strings"
)
func printPyramid(height int){
	for i := 1; i<=height; i++ {
		fmt.Printf("%s%s\n", strings.Repeat(" ", height-i), strings.Repeat("*", 2*i-1))
	}
}
func main(){
	var height int
	fmt.Print("Enter the height of pyramid: ")
	_, err:=fmt.Scanf("%d", &height)
	if err != nil{
		fmt.Println("Error:", err)
		return
	}
	printPyramid(height)
}