fun main() {

    print("Introduce una palabra: ")
    val palabra = readLine()?.trim() ?: ""


    val esPalindromo = palabra == palabra.reversed()


    if (esPalindromo) {
        println("La palabra '$palabra' es un palíndromo.")
    } else {
        println("La palabra '$palabra' no es un palíndromo.")
    }
}
