fun main() {
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")

    val asignaturasARepetir = mutableListOf<String>()

    for (asignatura in asignaturas) {
        print("¿Qué nota has sacado en $asignatura? (Introduzca un número entre 0 y 10): ")
        val nota = readLine()?.toDoubleOrNull()

        if (nota != null && nota >= 0 && nota <= 10) {
            if (nota >= 5) {
                println("$asignatura aprobada. Se elimina de la lista.")
            } else {
                asignaturasARepetir.add(asignatura)
                println("$asignatura suspendida. Se añade a la lista de asignaturas a repetir.")
            }
        } else {
            println("Nota inválida. Por favor, ingresa un valor entre 0 y 10.")
        }
    }

    println("\nAsignaturas que tienes que repetir:")
    if (asignaturasARepetir.isNotEmpty()) {
        for (asignatura in asignaturasARepetir) {
            println(asignatura)
        }
    } else {
        println("¡Enhorabuena! No tienes asignaturas que repetir.")
    }
}
