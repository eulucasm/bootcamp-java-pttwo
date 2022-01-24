import kotlin.math.atan
import kotlin.properties.Delegates

class Circle(var radius: Double = 0.0) {
    val pi: Double by lazy { ((4.0 * atan(1.0 / 5.0)) - atan(1.0 / 239.0)) * 4.0 }
    val circumference: Double
        get() = pi * radius * 2
}


class Level(val id: Int, val boss: String) {
    companion object {
        var highestLevel = 0
    }

    var unlocked: Boolean by Delegates.observable(false) { _, old, new ->
        if (new && id > highestLevel) {
            highestLevel = id
        }
    }
}

class Lamp {
    lateinit var bulb: LightBulb
}

class LightBulb {
    companion object {
        const val maxCurrency = 40
    }

    var current by Delegates.vetoable(0) { _, _, new ->
        if (new > maxCurrency) {
            println("Current too high, Falling back to previous setting")
            false
        } else {
            true
        }
    }
}

fun main() {
    val circle = Circle(5.0)
    println(circle.circumference)

    val light = LightBulb()
    light.current = 9000
    println(light.current)
    light.current = 40
    println(light.current)

    val fancyLamp = Lamp()
    fancyLamp.bulb  = light
    println(fancyLamp.bulb.current)


    val level1 = Level(1, "Outside Cat")
    val level2 = Level(2, "Laser Pointer")
    val level3 = Level(3, "Mysterious Attic Sound")
    val level4 = Level(4, "Vacuum Cleaner")

    level1.unlocked = true
    println("Highest level ${Level.highestLevel}")

    level4.unlocked = true
    println("Highest level ${Level.highestLevel}")
}