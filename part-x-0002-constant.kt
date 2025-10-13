fun main() {
    
   // val is NOT mutable, constant
    
    val salesTotal = 22_500_000
    
    salesTotal += 500_000 // Error => "'val' cannot be reassigned."
    
    println(salesTotal)
   
}
