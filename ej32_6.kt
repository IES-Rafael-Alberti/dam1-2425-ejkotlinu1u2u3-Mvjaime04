fun main() {

    val persona = mutableMapOf<String, String>()


    print("Introduce tu nombre: ")
    val nombre = readLine() ?: ""
    persona["nombre"] = nombre
    println("Información actual: $persona")


    print("Introduce tu edad: ")
    val edad = readLine() ?: ""
    persona["edad"] = edad
    println("Información actual: $persona")

    print("Introduce tu sexo: ")
    val sexo = readLine() ?: ""
    persona["sexo"] = sexo
    println("Información actual: $persona")


    print("Introduce tu teléfono: ")
    val telefono = readLine() ?: ""
    persona["telefono"] = telefono
    println("Información actual: $persona")


    print("Introduce tu correo electrónico: ")
    val correo = readLine() ?: ""
    persona["correo"] = correo
    println("Información actual: $persona")
}
