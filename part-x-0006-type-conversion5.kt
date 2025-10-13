fun main() {
    
	var year = "2025"
    
	var yearInt = year.toIntOrNull()
    
    if (yearInt != null) {
        
        println("Next year is ${yearInt + 1}") // Next year is 2026
        
    } else {
        
        println("Year info must be a positive integer number!")
    }
}

