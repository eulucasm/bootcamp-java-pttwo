package functionsECuntomTypes
//P01E06 Conclusion Lambda Grad Finale =)

fun main(){
    val lotsOfDwarves = listOf(
        listOf("Sleepy","Grumpy","Doc","Bashful","Sneezy"),
        listOf("Thorin","Noru","Bombur")
    )

    val (beforeM , mAndAfter) = lotsOfDwarves.flatMap { dwarves ->
        dwarves.filter{it.length > 3}
    }.sortedBy { -it.length }.partition { it < "M" }

    val groupedBeforeM = beforeM.groupBy { it.first() }
    println(groupedBeforeM)
    println(mAndAfter)
}