open class Persona (
    val dninUMBER: Int,
    val nombre: String,
    val fechaNacimiento: String,
    val direccion: String,
    val ciudad: String) {

    fun mostrarDatos(){
        println("Nombre: ${nombre}")
        println("DNI: ${dninUMBER}")
        println("fecha de nacimiento: ${fechaNacimiento}")
        println("Dirección: ${direccion}")
        println("Ciudad: ${ciudad}")
    }
}