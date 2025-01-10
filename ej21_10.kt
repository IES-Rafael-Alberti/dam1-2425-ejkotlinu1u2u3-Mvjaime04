fun main() {
    println("Bienvenido a la pizzería Bella Napoli!")
    print("¿Quieres una pizza vegetariana o no vegetariana? (Escribe 'vegetariana' o 'no vegetariana'): ")
    val tipoPizza = readLine()?.trim()?.lowercase()

    val ingredientesComunes = listOf("mozzarella", "tomate")
    val ingredientesVegetarianos = listOf("pimiento", "tofu")
    val ingredientesNoVegetarianos = listOf("peperoni", "jamón", "salmón")

    if (tipoPizza == "vegetariana" || tipoPizza == "no vegetariana") {
        val ingredientesDisponibles = if (tipoPizza == "vegetariana") ingredientesVegetarianos else ingredientesNoVegetarianos

        println("Elige un ingrediente adicional (además de mozzarella y tomate):")
        ingredientesDisponibles.forEach { ingrediente ->
            println("- $ingrediente")
        }

        print("Introduce el ingrediente elegido: ")
        val ingredienteElegido = readLine()?.trim()?.lowercase()

        if (ingredientesDisponibles.contains(ingredienteElegido)) {
            val ingredientesFinales = ingredientesComunes + ingredienteElegido
            println("Has elegido una pizza ${tipoPizza} con los siguientes ingredientes: ${ingredientesFinales.joinToString(", ")}.")
        } else {
            println("Error: El ingrediente elegido no es válido.")
        }
    } else {
        println("Error: Por favor, elige 'vegetariana' o 'no vegetariana'.")
    }
}
