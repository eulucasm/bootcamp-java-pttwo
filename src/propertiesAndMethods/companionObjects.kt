package propertiesAndMethods

class Level(val id: Int, val boss: String, var unlocked: Boolean) {
    companion object {
        var highestLevel = 1
    }
}

fun main() {
    val level1 = Level(1, "Outside Cat", true)
    val level2 = Level(2, "Laser Pointer", false)
    val level3 = Level(3, "Mysterius Attic Sound", false)
    val level4 = Level(4, "Vacuum Cleaner", false )

    println("Highest level ${Level.highestLevel}")

    val tv = TV(width = 95.87, height = 53.93)
    println(tv.diagonal)

    tv.width = tv.height
    println(tv.diagonal)

    tv.diagonal = 65
    println("That'll be ${tv.width} inches wide!")
}