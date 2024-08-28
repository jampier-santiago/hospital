enum class Especialidad {
    CARDIOLOGIA,
    DERMATOLOGIA,
    GINECOLOGIA,
    PEDIATRIA,
    NEUROLOGIA,
    ORTOPEDIA,
    PSIQUIATRIA,
    RADIOLOGIA,
}

enum class Servicio {
    CIRUGIA,
    OFTALMOLOGIA,
    PEDIATRIA,
    GINECOLOGIA,
    CARDIOLOGIA,
    NEUROLOGIA,
    ORTOPEDIA,
    PSIQUIATRIA,
    RADIOLOGIA,
    UROLOGIA
}

class Medico (
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
    salario: Int,
    porcentajeHoraExtra: Int,
    val especialidad: Especialidad,
    val servicio: Servicio,
    val numeroConsultorio: Int
    ): EmpleadoPlanilla(
    dninUMBER,
    nomber,
    fechaNacimiento,
    direccion,
    ciudad,
    codigoEmpleado,
    numeroHorasExtras,
    fechaIngreso,
    area,
    cargo,
    salario,
    porcentajeHoraExtra) {
        fun mostrartInformacion() {
            mostrarDatos()

            println("Especialidad: ${especialidad}")
            println("Servicio: ${servicio}")
            println("Número de consultorio: ${numeroConsultorio}")
        }
}