fun main() {
    
    var counter = 0
    
	while (counter < 79) {
        
        counter += 7
        
        if (counter % 21 == 0) {
            continue
        }
        
        if (counter == 49) {
            break
        }
        
        print("counter: $counter ") // counter: 7 counter: 14 counter: 28 counter: 35 
        
    }
     
}

