fun main() {
    
    val mathF = MathFunctions()
    
    val sumResult = mathF.sum(-5, 22 , 17)
    
    print(sumResult) // 34
    
   
}

class MathFunctions {
    
    fun sum(x: Int, y: Int, z: Int) : Int {
        
        return x + y + z
    }
    
}
