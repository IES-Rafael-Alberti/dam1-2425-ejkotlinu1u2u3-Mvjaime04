fun main() {
    print("Introduce una palabra: ")
    val palabra = readLine()?.toLowerCase() ?: ""

    val vocales = mapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)

    var conteoVocales = vocales.toMutableMap()
    for (letra in palabra) {
        if (letra in conteoVocales) {
            conteoVocales[letra] = conteoVocales[letra]!! + 1
        }
    }

    for ((vocal, cantidad) in conteoVocales) {
        println("La vocal '$vocal' aparece $cantidad veces.")
    }
}
