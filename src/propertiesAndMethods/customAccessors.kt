package propertiesAndMethods

import kotlin.math.roundToInt
import kotlin.math.sqrt


// 4-02 Custom Accessors - Starter

class TVMath{
    companion object{
        fun getDiagonal(width: Double, height: Double):Int{
            val result = sqrt(width * width + height * height)
            return result.roundToInt()
        }
         fun getWidthAndHeight(diagonal:Int, ratioWidth: Double, ratioHeight:Double):Pair<Double, Double>{
             val ratioDiagonal = sqrt(ratioWidth* ratioWidth + ratioHeight * ratioHeight)
             val height = diagonal * ratioHeight / ratioDiagonal
             val width = height * ratioWidth / ratioHeight
             return Pair(width, height)
         }
    }
}

class Person(val firstName: String, val lastName: String) {
    val fullName = "$firstName $lastName"
}

class TV(var width: Double, var height: Double) {
    var diagonal: Int
        get() {
           return TVMath.getDiagonal(width, height)
        }
        set(value){
            val size = TVMath.getWidthAndHeight(
                diagonal = value,
                ratioWidth = 16.0,
                ratioHeight = 9.0
            )
            width = size.first
            height = size.second
        }
}

fun main() {

    val tv = TV(width = 95.87, height = 53.93)
    println(tv.diagonal)

    tv.width = tv.height
    println(tv.diagonal)

    tv.diagonal = 65
    println("That'll be ${tv.width} inches wide!")
}