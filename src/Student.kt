class Student(name: String, lastName: String, age: Int):Person(name, lastName, age) {
    override fun work() {
        println("${getFullName()} учится в университете.")
    }

    override fun rest() {
        if (age>=20) {
            println("${getFullName()} в свободное время играет в видео игры.")
        }else{
            println("${getFullName()} проводит свободное время в спортзале.")
        }

    }
    fun roleLife ():String{
        return "студент"
    }

}