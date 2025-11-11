fun main() {
    
	val cities = arrayListOf("ankara", "istanbul", "izmir")
    
    cities.add("antalya")
    
    cities.addAll(listOf("bursa", "adana"))
    
    println(cities) // [ankara, istanbul, izmir, antalya, bursa, adana]
    
}

