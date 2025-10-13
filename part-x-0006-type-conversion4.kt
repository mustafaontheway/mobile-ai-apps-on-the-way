fun main() {
    
	var year = "2025"
    
    try {
        
        var year = year.toInt()
        
        year++
        
        println(year) // 2026
        
    } catch(nfe: NumberFormatException) {
        
        println("Please, use positive integer type for year information")
        
        //println(nfe) // NumberFormatException: For input string: "2025 year"
    }
}

