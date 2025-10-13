fun main() {
    
	var year = "2025z"
    
	var yearInt = year.toIntOrNull()
    
	yearInt?.let {
        
        println("Next year is ${yearInt + 1}")
    }
    
    println("No output!")
}

