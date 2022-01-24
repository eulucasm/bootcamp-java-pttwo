package propertiesAndMethods

class Wizard(var firstName: String, var lastName: String){
    var fullName: String
    get() = "$firstName $lastName"
    set(newFullName){
        val names = newFullName.split(" ")
        if (names.size != 2){
            println("$newFullName is not a proper full name for a Wizard.")
        }else {
            firstName = names.first()
            lastName = names.last()
        }
    }

    companion object{
        var commonMagicalIngredients = mutableListOf<String>(
           "Eye of Haystack Needle",
           "The Force",
           "Wow-wow Sauce!"
        )
    }
}

fun main(){
    val wizard = Wizard("Hermione", "Sidious")
    println(wizard.fullName)

    wizard.lastName = "Skywalker"
    println(wizard.fullName)

    wizard.fullName = "SeverusWenderlich"
    wizard.fullName = "Dracula the Gray"
    println("firstName : ${wizard.firstName}, last Name: ${wizard.lastName}")

    wizard.firstName = "Lea Weatherwax"
    println("firstName : ${wizard.firstName}, last Name: ${wizard.lastName}")

    Wizard.commonMagicalIngredients.add("Meow of cat")
    println(Wizard.commonMagicalIngredients)
}