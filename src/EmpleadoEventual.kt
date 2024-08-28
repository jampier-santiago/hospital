class EmpleadoEventual (
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
    val honorariosPorHora: Int,
    val totalHoras: Int,
    val fechaTerminoContrato: String,
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

            println("Honorarios por hora: ${honorariosPorHora}")
            println("Total de horas: ${totalHoras}")
            println("Fecha de término de contrato: ${fechaTerminoContrato}")
        }
}