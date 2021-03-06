package functionsECuntomTypes

//P01E01 - Review - Starter

fun main(){
    fun printRange(){
        for(number in 1..5) print("$number \t ")
        println()
    }
    printRange()

    fun printRange(range: IntRange){
        for (number in range) print("$number \t ")
        println()
    }
    printRange(6..10)

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean): IntRange{
        return if(isHalfOpen){
            start until end
        } else {
            start..end
        }
    }
    val halfOpenRange = createRange(11,15, true)
    printRange(halfOpenRange)

    val namedArguments = createRange(isHalfOpen = true, start = 100, end = 115)
    printRange(namedArguments)

    printRange(createRange(100, 101, isHalfOpen = false))

    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if(isHalfOpen) start until end else start..end

    fun printRange(range: CharRange){
        for (char:Char in range) print("$char \t")
        println()
    }

    val closedRange = createRange('A','G')
    printRange(closedRange)

}