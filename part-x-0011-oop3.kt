class Employee(var name: String, var department: String, var salary: Int) {
    
    fun print_emp_data() {
        
        println("Employee name: $name - department: $department - salary: $salary")
        
    }
    
    fun salary_up(amount: Int) {
        
        salary += amount
    }
    
}


fun main() {
    
    val emp_ayhan = Employee("Ayhan Bilir", "HR", 62_000)
    
    emp_ayhan.print_emp_data() // Employee name: Ayhan Bilir - department: HR - salary: 62000
    
    emp_ayhan.salary_up(6000)
    
    emp_ayhan.print_emp_data() // Employee name: Ayhan Bilir - department: HR - salary: 68000
    
}

