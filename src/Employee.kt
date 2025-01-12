class Employee (name: String, lastName: String, age: Int):Person(name, lastName, age) {
    override fun work() {
        println("${getFullName()} работает на кране.")
    }

    override fun rest() {
        println("${getFullName()} после работы смотрит телевизор.")
    }
    fun roleLife ():String{
        return "рабочий"
    }
}