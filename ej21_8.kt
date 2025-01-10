fun main() {
    val salarioBase = 2400.0

    print("Introduce la puntuación obtenida (0.0, 0.4, 0.6 o más): ")
    val puntuacion = readLine()?.toDoubleOrNull()

    if (puntuacion == null || puntuacion < 0.0) {
        println("Error: La puntuación introducida no es válida.")
        return
    }

    val nivel = when {
        puntuacion == 0.0 -> "Inaceptable"
        puntuacion == 0.4 -> "Aceptable"
        puntuacion >= 0.6 -> "Meritorio"
        else -> null
    }

    if (nivel != null) {
        val salario = salarioBase * puntuacion
        println("Nivel de evaluación: $nivel")
        println("Dinero obtenido: ${"%.2f".format(salario)} €")
    } else {
        println("Error: La puntuación introducida no es válida.")
    }
}
