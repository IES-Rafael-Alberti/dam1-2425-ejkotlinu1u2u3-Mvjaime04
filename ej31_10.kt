fun main() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)

    val menorPrecio = precios.minOrNull() ?: "Lista vacía"
    val mayorPrecio = precios.maxOrNull() ?: "Lista vacía"

    println("El menor precio es: $menorPrecio")
    println("El mayor precio es: $mayorPrecio")
}
