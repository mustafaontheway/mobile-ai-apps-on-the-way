fun main() {
    
    val mathF = MathFunctions()
    
    mathF.print_sum(12, 78) // 12 + 78 = 90
}

class MathFunctions {
    
    // void function
    
    fun print_sum(x: Int, y: Int) {
        
        print("$x + $y = ${x + y}")
    }
}
