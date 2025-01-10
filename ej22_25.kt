fun main() {
    print("Introduce una frase: ")
    val frase = readLine()?.trim() ?: ""

    val palabras = frase.split("\\s+".toRegex()).filter { it.isNotEmpty() }

    if (palabras.isNotEmpty()) {
        val palabraMasLarga = palabras.maxByOrNull { it.length } ?: ""

        println("La palabra más larga es: '$palabraMasLarga'")
        println("Número de palabras: ${palabras.size}")
    } else {
        println("No se introdujo ninguna palabra.")
    }
}
