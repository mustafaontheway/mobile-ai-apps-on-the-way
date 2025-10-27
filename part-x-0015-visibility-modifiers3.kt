open class A {
    
    val a = "Hi"
    
    public val b = 21
    
    internal val c = 3.14 
    
    private val d = "Lorem"
    
    protected val e = 2025
    
}


class B: A() {
    
    init {
        
        println(a)
        println(b)
        println(c)
        
        //println(d) //Cannot access 'val d: String': it is private in 'A'.
        
        println(e)
    }
        
	
    
}

fun main() {
    
    val bInstance = B()
    
}

// Hi
// 21
// 3.14
// 2025
