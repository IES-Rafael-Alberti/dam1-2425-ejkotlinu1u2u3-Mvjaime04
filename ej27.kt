fun main() {
    try {
        print("Introduce el nombre del producto: ")
        val nombreProducto = readLine().orEmpty()

        print("Introduce el precio del producto: ")
        val precioUnitario = readLine()?.toDoubleOrNull() ?: throw IllegalArgumentException("Precio no válido.")

        print("Introduce el número de unidades: ")
        val numeroUnidades = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Número de unidades no válido.")

        val costeTotal = precioUnitario * numeroUnidades

        println(
            "Producto: $nombreProducto | " +
                    "Precio unitario: ${"%06.2f".format(precioUnitario)} | " +
                    "Unidades: ${"%03d".format(numeroUnidades)} | " +
                    "Coste total: ${"%08.2f".format(costeTotal)}"
        )
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
