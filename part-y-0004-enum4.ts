// for memory perf, use const!

const enum Strategies {
    Buy = "Buy",
    Sell = "Sell",
    Keep = "Keep",
    Wait = "Wait"
}

// enum Strategies {
//     Buy = "Buy",
//     Sell = "Sell",
//     Keep = "Keep",
//     Wait = "Wait"
// }

let currentStrategy: Strategies = Strategies.Keep 

console.log(currentStrategy) // Keep
