package main

import "fmt"

func main() {

	fmt.Println(5 > 2 && -3.7 > -2.3)

	fmt.Println(5 == 6 && 4 != 6)

	fmt.Println(2 >= -100 && 4 != 6)

	fmt.Println(3 == 3 || 4 != 4)

	fmt.Println(5 <= 6 || true)

	fmt.Println(10 > 11 || false)
}

// false
// false
// true
// true
// true
// false
