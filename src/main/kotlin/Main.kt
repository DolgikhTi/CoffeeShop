import kotlin.system.exitProcess

fun main() {
    val tokioCoffeeShop = TokioCoffeeShop(7.0, 10.5, 11.0)
    val newYorkCoffeeShop = NewYorkCoffeeShop(5.0, 8.5, 9.5)

    var currentCoffeeShop: CoffeeShop

    while (true) {
        println("Hello! Choose a city:")
        println("1. Tokio\n2. New York\n\n0. Exit")

        currentCoffeeShop = when (readln()) {
            "1" -> tokioCoffeeShop
            "2" -> newYorkCoffeeShop
            "0" -> break
            else -> {
                println("Error")
                continue
            }
        }

        chooseDrink(currentCoffeeShop)
    }
}

private fun chooseDrink(currentCoffeeShop: CoffeeShop) {
    println("Choose a drink:")
    println("1. Americano\n2. Cappuccino\n3. Latte\n\n0. Show statistics")

    when (readln()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checkAndAskForBiscuits(currentCoffeeShop)
        }

        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checkAndAskForBiscuits(currentCoffeeShop)
        }

        "3" -> {
            currentCoffeeShop.makeLatte()
            checkAndAskForBiscuits(currentCoffeeShop)
        }

        "0" -> currentCoffeeShop.showStatistics()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}

private fun checkAndAskForBiscuits(currentCoffeeShop: CoffeeShop) {
    if (currentCoffeeShop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes\n2. No")

        val isBiscuits = readln()

        if (isBiscuits == "1")
            currentCoffeeShop.sellBiscuits()
        else (println("Have a good day"))
    }
}