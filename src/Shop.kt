abstract class Shop(val name: String,
                    val address: String,
                    val timeOpen: String,
                    val timeClosed:String) {

    abstract fun open()

    abstract fun close()

    open fun toInventory() {
        println("Магазин $name закрывается - на инвентаризацию. ")
        println("ВНИМАНИЕ!!!")
        close()
    }

}