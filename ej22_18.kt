fun main() {
    var contadorPares = 0

    println("Introduce números enteros positivos. Para terminar, ingresa -1.")

    while (true) {
        print("Número: ")
        val numero = readLine()?.toIntOrNull()

        if (numero == null || numero == -1) {
            break
        }

        if (numero > 0) {
            val sumaDigitos = numero.toString().map { it.toString().toInt() }.sum()
            println("La suma de los dígitos de $numero es: $sumaDigitos")

            if (numero % 2 == 0) {
                contadorPares++
            }
        } else {
            println("Por favor, introduce un número positivo.")
        }
    }

    println("Cantidad de números pares ingresados: $contadorPares")
}
