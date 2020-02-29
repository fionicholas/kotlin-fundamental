package com.github.fionicholas.kotlinfundamental


fun main(){
    val a : String = "Ada"
    print(a)

    //Safe calls operator (?.)
    val text: String? = null
    text?.length

     // Elvis Operator
    val textLength = text?.length ?: 7

    //non-null assertion !!
    //text!!.length

    //Class and Data Class
    class Student(val name : String, val age : Int)
    data class DataStudent(val name : String, val age : Int)
    val student = Student("Fiorent", 22)
    val dataStudent = DataStudent("Fiorent", 22)
    println(student)
    println(dataStudent)

    //List
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    println(numberList[3])

    val anyList = mutableListOf(1, "dua", 3, 4, 5)
    anyList.add('d') // menambah item di akhir list
    anyList.set(1, "tiga") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.remove(3) // menghapus item User()
    println(anyList)

    //Set
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    //Map
    val lab = mapOf(
        "Lab1" to "Multimedia",
        "Lab2" to "Pemrograman",
        "Lab3" to "Sistem Informasi"
    )
    println(lab["Lab3"])

    //Filter and FilterNot
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }

    val notEvenList = numberList.filterNot { it % 2 == 0 }

   // MAP
    val multipliedBy5 = numberList.map { it * 5 }

    //COUNT
    println(numberList.count())

    //SUM
    val total = numberList.sum()

    //SORTED
    val myName = listOf('F', 'I', 'O', 'R', 'E', 'N','T')
    val ascendingSort = myName.sorted()

    val descendingSort = myName.sortedDescending()

    println(descendingSort)

    //Lambda receiver (this)
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())

    //Lambda argument (it)
    val lambdaName = "Fiorent"
    lambdaName.let {
        val message = "$it Nicholas"
        println(message)
    }

    //CLASS
    val student1 = Student("Fiorent Nicholas", 1.72, 22, false)
    val student2 = Student(height = 1.32, name = "Nicholas aja", isMarried = true, age = 25)
    println("Nama: ${student1.name}, Tinggi: ${student1.height}, Umur: ${student1.age}, Menikah: ${student1.isMarried}" )
    println(student1)

}

class Student(val name: String, val height: Double, val age: Int, val isMarried: Boolean){
    fun ngoding() {
        println("$name suka ngoding")
    }

    fun makan(){
        println("$name suka jajan dikantin !")
    }
}

// Inheritances
open class Student2(val name: String, val height: Double, val age: Int, val isMarried: Boolean){
    fun ngoding() {
        println("$name suka ngoding")
    }

    fun ngoding(bahasa : String) {
        println("$name suka ngoding $bahasa")
    }

    fun makan(){
        println("$name suka jajan dikantin !")
    }
}

fun inhe() {
    class FtiStudent(name: String, height: Double, age: Int, isMarried: Boolean) :
        Student2(name, height, age, isMarried)

    val student3 = FtiStudent("Fiorent Nicholas", 1.72, 22, false)
    println(student3.ngoding("Kotlin"))
}
