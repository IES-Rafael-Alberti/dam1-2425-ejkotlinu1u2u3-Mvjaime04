fun main() {

    val cestaCompra = mutableMapOf<String, Double>()


    while (true) {

        print("Introduce el artículo (o 'terminar' para finalizar): ")
        val articulo = readLine() ?: ""


        if (articulo.lowercase() == "terminar") {
            break
        }


        print("Introduce el precio de $articulo: ")
        val precio = readLine()?.toDoubleOrNull()


        if (precio != null) {

            cestaCompra[articulo] = precio
        } else {
            println("Precio no válido, por favor introduce un número.")
        }
    }


    println("\nLista de la compra")
    var total = 0.0

    for ((articulo, precio) in cestaCompra) {
        println("$articulo\t$precio")
        total += precio
    }


    println("Total\t$total")
}
