fun main() {
    
    val dep1 = Departments("Finance", 13)
    val dep2 = Departments("Sales", 17)
    val dep3 = Departments("FinTech", 3)
    
    val man1 = Managers("Ayhan Bilir", dep1)
    val man2 = Managers("Kağan İyi", dep2)
    val man3 = Managers("Aykan Güçlü", dep3)
    
    val emp1 = Employees("Sevda Kanat", dep1, man1)
    val emp2 = Employees("İstemi Beyli", dep2, man2)
    val emp3 = Employees("Aygün Arslan", dep3, man3)
    
    println(emp3.empName) // Aygün Arslan
    println(emp3.empDep.depName) // FinTech
    println(emp3.empDep.depID) // 3
    println(emp3.empManager.manName) // Aykan Güçlü
    
}


data class Departments(var depName: String, var depID: Int) {
    
}

data class Managers(var manName: String, var manDep: Departments) {
    
}

data class Employees(var empName: String, var empDep: Departments, var empManager: Managers) {
    
}
