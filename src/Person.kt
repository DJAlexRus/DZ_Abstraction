abstract class Person(val name: String,
             val lastName:String,
            val age:Int){

    // Обычные функции
    fun getFullName(): String {
        return "$name $lastName"
    }

    fun ageValid(): Boolean {
        return age >= 18
    }

    // Абстрактные функции
    abstract fun work()
    abstract fun rest()
}