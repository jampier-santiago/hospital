open class EmpleadoPlanilla (
    dninUMBER: Int,
    nomber: String,
    fechaNacimiento: String,
    direccion: String,
    ciudad: String,
    codigoEmpleado: String,
    numeroHorasExtras: Int,
    fechaIngreso: String,
    area: String,
    cargo: String,
    val salario: Int,
    val porcentajeHoraExtra: Int,
    ): Empleado(dninUMBER,
    nomber,
    fechaNacimiento,
    direccion,
    ciudad,
    codigoEmpleado,
    numeroHorasExtras,
    fechaIngreso,
    area,
    cargo ) {
        fun mostrarInformacion() {
            mostrarDatos()

            println("Salario: ${salario}")
            println("Porcentaje de horas extras: ${porcentajeHoraExtra}")
        }
}