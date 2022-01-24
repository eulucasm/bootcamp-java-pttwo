package functionsECuntomTypes

class Student(val name: String, var grade: Int, var pet: String?, var libraryBooks: List<String>) {
    fun getPassStatus(lowestPass: Int = 50) {
        grade >= lowestPass
    }

    fun earnExtraCredit() {
        grade += 10
    }
}

val cris = Student(
    name = "Cris", grade = 49, pet = "Mango", libraryBooks = listOf(
        "the book of atrus", "Living by the Code",
        "Mastering Git"
    )
)
val sam = Student("Sam", 99, null, listOf("Master Git"))
val catie = Student("Catie", 75, "Ozma", listOf("Hogfather", "Good Omens"))
val andrea = Student("Andrea", 88, "Kitten", listOf("Dare to lead", "The Wariors Apprectice"))

val students = arrayOf(cris, sam, catie, andrea)

fun main(){
    for (student in students) {
        student.earnExtraCredit()
    }

    students.forEach { student ->
        println("Old grade : ${student.grade}")
        student.earnExtraCredit()
        println("Old grade : ${student.grade}")
    }

    val classLibraryBooks: MutableList<List<String>> = mutableListOf()
    for(student in students){
        classLibraryBooks.add(student.libraryBooks)
    }

    val classLibraryBooks2 = students.map{student ->
        student.libraryBooks
    }
    println(classLibraryBooks2)

    //create a list of student pets
    val classPets = students.mapNotNull { it.pet }
    println(classPets)

}
