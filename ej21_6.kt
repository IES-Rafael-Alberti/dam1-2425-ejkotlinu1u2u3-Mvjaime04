fun main() {
    print("Introduce tu nombre: ")
    val nombre = readLine()?.trim().orEmpty()

    print("Introduce tu sexo (hombre/mujer): ")
    val sexo = readLine()?.trim()?.lowercase().orEmpty()

    val grupo = when {
        sexo == "mujer" && nombre.lowercase() < "m" -> "A"
        sexo == "hombre" && nombre.lowercase() > "n" -> "A"
        sexo == "hombre" || sexo == "mujer" -> "B"
        else -> "Desconocido"
    }

    if (grupo == "Desconocido") {
        println("Error: Sexo no válido. Por favor, introduce 'hombre' o 'mujer'.")
    } else {
        println("Tu grupo es: $grupo")
    }
}
