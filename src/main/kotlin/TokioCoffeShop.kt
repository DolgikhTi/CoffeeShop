class TokioCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Tokio Coffee Shop")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Americano in Tokio Coffee Shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Americano in Tokio Coffee Shop")
    }

    override fun sellBiscuits() {
        println("Take your biscuits")
    }
}