fun main() {
    try {
        print("Introduce el dividendo: ")
        val dividendo = readLine()?.toDoubleOrNull() ?: throw IllegalArgumentException("Dividendo no válido.")

        print("Introduce el divisor: ")
        val divisor = readLine()?.toDoubleOrNull() ?: throw IllegalArgumentException("Divisor no válido.")

        if (divisor == 0.0) {
            println("Error: No es posible dividir por cero.")
        } else {
            val resultado = dividendo / divisor
            println("El resultado de la división es: $resultado")
        }
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
