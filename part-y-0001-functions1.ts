function profit_or_loss(sales: number, cost: number) : string {

    if (sales <= cost) {

        return `No profit! Loss: $${sales - cost}`
    }

    return `Profit: $${sales - cost}`
}

console.log(profit_or_loss(17000, 25000))

console.log(profit_or_loss(45000, 35780))

// No profit! Loss: $-8000
// Profit: $9220
