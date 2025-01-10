import kotlin.math.sqrt

fun main() {
    print("Introduce una lista de números separados por comas: ")
    val entrada = readLine() ?: ""


    val numeros = entrada.split(",")
        .mapNotNull { it.trim().toDoubleOrNull() }


    if (numeros.isNotEmpty()) {

        val media = numeros.average()


        val desviacionTipica = sqrt(numeros.sumOf { (it - media).pow(2) } / numeros.size)


        println("La media de los números es: $media")
        println("La desviación típica de los números es: $desviacionTipica")
    } else {
        println("No se introdujeron números válidos.")
    }
}


fun Double.pow(exponent: Int): Double = Math.pow(this, exponent.toDouble())
