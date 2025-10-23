fun main() {
    
   val result = 3.multTwoPlusOne()
   
   print(result) // 7
}

// y = 2 * x + 1

fun Int.multTwoPlusOne() : Int {
    
    return this * 2 + 1 // this -> Int class
}
