fun main() {
    
   val result = 3.cube()
   
   print(result) // 27
}


fun Int.cube() : Int {
    
    return this * this * this
}
