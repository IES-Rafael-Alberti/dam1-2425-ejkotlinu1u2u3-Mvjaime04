fun main() {

    val diccionario = mutableMapOf<String, String>()

    print("Introduce las traducciones en el formato 'español:inglés', separadas por comas (ejemplo: hola:hello,adiós:goodbye): ")
    val entrada = readLine() ?: ""


    val pares = entrada.split(",")
    for (par in pares) {
        val traduccion = par.split(":")
        if (traduccion.size == 2) {
            val palabraEspañol = traduccion[0].trim()
            val palabraIngles = traduccion[1].trim()
            diccionario[palabraEspañol] = palabraIngles
        }
    }


    print("Introduce una frase en español para traducir: ")
    val frase = readLine() ?: ""


    val palabras = frase.split(" ")
    val fraseTraducida = palabras.joinToString(" ") { palabra ->

        diccionario[palabra] ?: palabra
    }


    println("Frase traducida: $fraseTraducida")
}
