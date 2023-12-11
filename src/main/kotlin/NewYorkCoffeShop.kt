class NewYorkCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice) {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in New York Coffee Shop")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Americano in New York Coffee Shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Americano in New York Coffee Shop")
    }
}