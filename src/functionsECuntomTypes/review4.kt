package functionsECuntomTypes

fun main() {

    var prices = arrayOf(1.50, 10.00, 4.99, 2.30, 8.19)

    //forEach as a for loop
    //for(price in prices){
    //  println(price)
    //}

    prices.forEach {
        println(it)
    }
    prices.forEach(::println)
    println()

    //map as a for loop
//    var salePrices = mutableListOf<Double>()
//    for (price in prices){
//        salePrices.add(price * 0.9)
//    }
    val salePrices = prices.map { it * 0.9 }
    println(salePrices)
    println()

    //mapNotNull
    val userInput = listOf("meow!", "15", "37.5", "seven", "42")

    val number = userInput.map { it.toIntOrNull() }
    println(number)
    println()

    val validInput = userInput.mapNotNull { it.toIntOrNull() }
    println(validInput)
    println()

}