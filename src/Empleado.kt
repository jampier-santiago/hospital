open class Empleado(
    dninUMBER: Int,
    nomber: String,
    fechaNacimiento: String,
    direccion: String,
    ciudad: String,
    val codigoEmpleado: String,
    val numeroHorasExtras: Int,
    val fechaIngreso: String,
    val area: String,
    val cargo: String,
) : Persona(dninUMBER, nomber, fechaNacimiento, direccion, ciudad) {
}