fun main() {
    
    println(Sample.year) // 2025
    
    Sample.greet("Ayhan") // Hi Ayhan!
}


class Sample {
    
    companion object {
        
        var year = 2025
        
        fun greet(name: String) {
            
            println("Hi $name!")
        }
    }
}
