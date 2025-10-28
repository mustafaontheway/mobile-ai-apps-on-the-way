fun main() {
      
}

data class Departments(var depName: String, var depID: Int) {
    
}

data class Managers(var manName: String, var manDep: Departments) {
    
}

data class Employees(var empName: String, var empDep: Departments, var empManager: Managers) {
    
}
