class Employee(var name: String, var department: String, var salary: Int) {
    
    init {
        
        println("Init is here")
    }
    
}


fun main() {
    
    val emp_ayhan = Employee("Ayhan Bilir", "HR", 62_000)
    
    println(emp_ayhan.name)
    println(emp_ayhan.department)
    println(emp_ayhan.salary)
    
    emp_ayhan.salary = 65_000
    
    println(emp_ayhan.salary)
   
}

// Init is here
// Ayhan Bilir
// HR
// 62000
// 65000
