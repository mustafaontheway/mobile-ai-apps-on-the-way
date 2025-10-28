fun main() {
    
	val profitOrLoss1 = profitCalculator(6, Products.PHONE)
    
    println("Sales result 1: $profitOrLoss1") // Sales result 1: 94000
      
}

enum class Products {
    
    TV,
    PHONE,
    PC
}

fun profitCalculator(quantity: Int, product: Products): Int {
    
    return when(product) {
        
        Products.TV -> 15_000 * quantity - 23_000
        Products.PHONE -> 18_000 * quantity - 14_000
        Products.PC -> 43_000 * quantity - 37_500
    }
}
