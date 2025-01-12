fun main() {
//Задание1
        val pyaterochka = Pyaterochka("Ленина 60","9:00","20:00")
        pyaterochka.open()
        pyaterochka.close()
        pyaterochka.toInventory()
        println("---------------------------")
        val magnit = Magnit("Попова 2","8:00", "23:00")
        magnit.open()
        magnit.close()
        magnit.toInventory()
//Задание2
        println()
        val studentOne = Student("Иван", "Иванов", 17)
        val studentTwo = Student("Дарья", "Петрова", 20)
        val employee = Employee("Василий", "Васечкин", 30)

        println("${studentOne.getFullName()}, возраст ${studentOne.age} - ${studentOne.roleLife()}.")
        studentOne.work()
        studentOne.rest()
        if(studentOne.ageValid()) println("${studentOne.getFullName()} может официально устроиться на работу")
        println("-----------------")
        println("${studentTwo.getFullName()}, возраст ${studentTwo.age} - ${studentTwo.roleLife()}.")
        studentTwo.work()
        studentTwo.rest()
        if(studentTwo.ageValid()) println("${studentOne.getFullName()} может официально устроиться на работу")
        println("-----------------")
        println("${employee.getFullName()}, возраст ${employee.age} - ${employee.roleLife()}.")
        employee.work()
        employee.rest()
//Задание3
        println()
        val l = 3.52
        println("Длина отрезка $l метров.\nВ какие единицы вам перевести его длину?" +
                "\n\t1 — дециметр\n\t2 — километр\n\t3 — метр\n\t4 — миллиметр\n\t5 — сантиметр\n\t0 — выход")

        do {
            print("Введи нужную цифру: ")
            val selectNum = readln().toIntOrNull() ?: println("Неверный ввод!")
            val dateL = when (selectNum) {
                1 -> "Длина отрезка ${l * 10} дм"
                2 -> "Длина отрезка ${l /1000} км"
                3 -> "Длина отрезка $l м"
                4 -> "Длина отрезка ${l * 1000} мм"
                5 -> "Длина отрезка ${l * 100} cм"
                0 -> "exit"
                else -> "error"
            }
            if (dateL == "exit") {
                    println("Спасибо, что воспользовались программой!")
                    break
            }else if (dateL == "error"){
                    println("Ошибка выбора, Цифра должна быть в диапазоне от 0 до 5! ")
                    continue
            }else{
                    println(dateL)
            }
        }while(selectNum in 1..5)
        println("До новых встреч!")


}
