fun main() {
    print("Introduce el precio del producto en euros (ejemplo: 12.34): ")
    val input = readLine()

    try {
        val precio = input?.toDouble() ?: throw IllegalArgumentException("Entrada no válida.")
        val euros = precio.toInt()
        val centimos = ((precio - euros) * 100).toInt()

        println("El precio introducido tiene:")
        println("$euros euros")
        println("$centimos céntimos")
    } catch (e: NumberFormatException) {
        println("Error: Debes introducir un número válido con formato decimal.")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}