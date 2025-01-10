fun main() {
    print("Introduce una frase: ")
    val frase = readLine().orEmpty()

    print("Introduce una vocal: ")
    val vocal = readLine().orEmpty()

    if (vocal.length == 1 && vocal.lowercase() in listOf("a", "e", "i", "o", "u")) {
        val fraseModificada = frase.replace(vocal, vocal.uppercase(), ignoreCase = true)
        println("Frase modificada: $fraseModificada")
    } else {
        println("Error: Debes introducir una vocal válida.")
    }
}
