package propertiesAndMethods

import kotlin.math.roundToInt
import kotlin.math.sqrt

// 4-02 Custom Accessors - Starter

class Person(val firstName: String, val lastName: String) {
    val fullName = "$firstName $lastName"
}

class TV(var width: Double, var height: Double) {
    var diagonal: Int
        get() {
            val result = sqrt(width * width + height * height)
            return result.roundToInt()
        }
        set(value){
            val ratioWidth = 16.00
            val ratioHeith = 9.00
            val ratioDiagonal = sqrt(ratioWidth* ratioWidth + ratioHeith * ratioHeith)
            height = value.toDouble() * ratioHeith / ratioDiagonal
            width = height * ratioWidth / ratioHeith
        }
}

fun main() {
    val grace = Person("Grace", "Hopper")
    println(grace.fullName)

    val tv = TV(width = 95.87, height = 53.93)
    println(tv.diagonal)

    tv.width = tv.height
    println(tv.diagonal)

    tv.diagonal = 65
    println("That'll be ${tv.width} inches wide, Catie!")
}