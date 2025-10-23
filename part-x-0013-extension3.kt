fun main() {
    
   val result1 = 3.mult(19)
   
   println(result1) // 57
   
   val result2 = 5.mult(11)
   
   println(result2) // 55
}


fun Int.mult(number: Int) : Int {
    
    return this * number
}
