fun main() {
    var sumatoria = 0
    var numero: Int

    println("Introduce números enteros. Para terminar, ingresa 0.")

    do {
        print("Número: ")
        numero = readLine()?.toIntOrNull() ?: 0

        if (numero > 0) {
            sumatoria += numero
        }

    } while (numero != 0)

    println("La sumatoria de los números positivos ingresados es: $sumatoria")
}
