fun main() {
    
   val sales1 = 45_000
   
   println("Profit or loss for month1: ${sales1.profitOrLossCalculator()}")
   
   val sales2 = 72_000
    
   println("Profit or loss for month2: ${sales2.profitOrLossCalculator()}")
   
}

// assume fixed-cost = $55_000

fun Int.profitOrLossCalculator() : Int {
    
    return this - 55_000
}

// Profit or loss for month1: -10000
// Profit or loss for month2: 17000
