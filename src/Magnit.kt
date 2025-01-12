class Magnit(address: String, timeOpen: String, timeClosed:String)
        :Shop("Магнит",address,timeOpen,timeClosed){

    override fun open() {
        println("Магазин $name, по адресу: $address, работает с $timeOpen")
    }

    override fun close() {
        println("Магазин закрывается в $timeClosed")
    }

    override fun toInventory() {
        println("Магазин $name закрыт - на инвентаризацию")
    }
}