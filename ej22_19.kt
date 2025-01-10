fun main() {
    var opcion: Int

    do {
        println("Menú de opciones:")
        println("1 - Comenzar programa")
        println("2 - Imprimir listado")
        println("3 - Finalizar programa")

        print("Selecciona una opción (1, 2 o 3): ")
        opcion = readLine()?.toIntOrNull() ?: -1

        when (opcion) {
            1 -> {
                println("Comenzando el programa... ¡Ahora puedes realizar las operaciones!")
            }
            2 -> {
                println("Imprimiendo listado...")
                println("1. Elemento A")
                println("2. Elemento B")
                println("3. Elemento C")
            }
            3 -> {
                println("Finalizando el programa. ¡Hasta pronto!")
            }
            else -> {
                println("Opción incorrecta. Por favor, elige una opción válida (1, 2 o 3).")
            }
        }

    } while (opcion != 3)
}
