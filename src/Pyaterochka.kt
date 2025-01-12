class Pyaterochka (address: String, timeOpen: String, timeClosed:String)
    :Shop("Пятерочка",address,timeOpen,timeClosed) {

    override fun open() {
        println("Магазин $name, по адресу: $address, работает с $timeOpen")
    }

    override fun close() {
        println("Магазин закрывается в $timeClosed")
    }
}