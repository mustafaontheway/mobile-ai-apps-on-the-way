function sales_premium_calc(sales: number, cost: number) : [number, number] {

    let sales_result = sales - cost

    let premium: number 

    if (sales_result <= 0) {

        premium = 0
    } else {

        premium = sales * 0.07
    }

    return [sales_result, premium]
}

let premium_result1 = sales_premium_calc(45000, 29400)

console.log("premium1: " + premium_result1[1].toFixed(3)) // premium1: 3150.000
