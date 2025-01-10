fun main() {
    val contraseñaGuardada = "contraseña"

    print("Introduce la contraseña: ")
    val contraseñaUsuario = readLine().orEmpty()

    if (contraseñaGuardada.equals(contraseñaUsuario, ignoreCase = true)) {
        println("La contraseña es correcta.")
    } else {
        println("La contraseña es incorrecta.")
    }
}
