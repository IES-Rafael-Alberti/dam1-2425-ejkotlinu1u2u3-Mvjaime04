fun main() {
    print("Introduce los productos de la cesta de la compra, separados por comas: ")
    val input = readLine().orEmpty()


    val productos = input.split(",").map { it.trim() }.filter { it.isNotEmpty() }

    if (productos.isEmpty()) {
        println("No se introdujeron productos.")
    } else {
        println("Productos en la cesta de la compra:")
        productos.forEach { producto ->
            println("- $producto")
        }
    }
}
