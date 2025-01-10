fun main() {
    print("Introduce tu fecha de nacimiento (formato dd/mm/aaaa): ")
    val input = readLine().orEmpty()

    try {
      
        val partes = input.split("/")
        if (partes.size != 3) throw IllegalArgumentException("Formato incorrecto. Usa dd/mm/aaaa.")


        val dia = partes[0].toIntOrNull() ?: throw NumberFormatException("Día no válido.")
        val mes = partes[1].toIntOrNull() ?: throw NumberFormatException("Mes no válido.")
        val año = partes[2].toIntOrNull() ?: throw NumberFormatException("Año no válido.")


        if (dia !in 1..31) throw IllegalArgumentException("Día fuera de rango (1-31).")
        if (mes !in 1..12) throw IllegalArgumentException("Mes fuera de rango (1-12).")
        if (año < 1) throw IllegalArgumentException("Año no puede ser menor que 1.")

        println("Fecha introducida:")
        println("Día: $dia")
        println("Mes: $mes")
        println("Año: $año")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}

