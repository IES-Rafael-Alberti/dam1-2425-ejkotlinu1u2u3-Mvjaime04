fun main() {
    println("Introduce algo para que lo repita. Escribe 'salir' para terminar.")

    while (true) {
        print("Tú: ")
        val input = readLine()?.trim()

        if (input.equals("salir", ignoreCase = true)) {
            println("Programa terminado.")
            break
        } else {
            println("Eco: $input")
        }
    }
}
