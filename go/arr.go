package main
import "fmt"
func main(){
	arr := make([]int, 10)
	for i := 0; i < 10; i++ {
		arr[i] = i+1
	}
	fmt.Println(arr)
}