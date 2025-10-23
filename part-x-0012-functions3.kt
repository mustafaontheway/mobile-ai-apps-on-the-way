fun main() {
    
    val mathF = MathFunctions()
    
    val sumResult1 = mathF.sum(-5, 22 , 17)
    
    println(sumResult1) // 34
    
    val sumResult2 = mathF.sum(-5.2, 22.45 , 17.17)
    
    println(sumResult2) // 34.42
    
    val sumResult3 = mathF.sum(-5, 22 , 17, -47)
    
    println(sumResult3) // -13
    
}

class MathFunctions {
    
    // overloading
    
    fun sum(x: Int, y: Int, z: Int) : Int {
        
        return x + y + z
    }
    
    fun sum(x: Double, y: Double, z: Double) : Double {
        
        return x + y + z
    }
    
    fun sum(x: Int, y: Int, z: Int, t: Int) : Int {
        
        return x + y + z + t
    }
    
}
