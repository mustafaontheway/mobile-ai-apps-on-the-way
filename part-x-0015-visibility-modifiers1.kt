class A {
    
    val a = "Hi"
    
    public val b = 21
    
    internal val c = 3.14 
    
    private val d = "Lorem"
    
    protected val e = 2025
    
}


class B {
    
    val incomingData = A()
    
    init {
        
        println(incomingData.a)
        println(incomingData.b)
        println(incomingData.c)
    }
    
}

fun main() {
    
    val bInstance = B()
    
}

// Hi
// 21
// 3.14
