function division(a: number, b: number) : number {

    if (b === 0) {

        throw new TypeError("Cannot divide by zero! Denominator must be non-zero.")
    }

    return a / b
}

let result1 = division(3, 0)

console.log(result1) // 60


//         throw new TypeError("Cannot divide by zero! Denominator must be non-zero.");
//         ^

// TypeError: Cannot divide by zero! Denominator must be non-zero.
