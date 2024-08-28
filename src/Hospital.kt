class Hospital {
    // Attributos
    var pacientes = mutableListOf<Persona>()
    var medicos = mutableListOf<Medico>()
    var empleadoEventual = mutableListOf<EmpleadoEventual>()
    var empleadoPlanta = mutableListOf<EmpleadoPlanilla>()
    var citas = mutableListOf<Cita>()

    // Metodos

    fun verPacientes() {
        for (paciente in pacientes) {
            println("-------------------------------------")
            paciente.mostrarDatos()
            println("-------------------------------------")
            println("")
        }
    }

    fun verMedicos() {
        for (medico in medicos) {
            println("-------------------------------------")
            medico.mostrartInformacion()
            println("-------------------------------------")
            println("")
        }
    }

    fun verEmpleadosEventuales() {
        for (empleado in empleadoEventual) {
            println("-------------------------------------")
            empleado.mostrarInformacion()
            println("-------------------------------------")
            println("")
        }
    }

    fun verEmpleadosPlanta() {
        for (empleado in empleadoPlanta) {
            println("-------------------------------------")
            empleado.mostrarInformacion()
            println("-------------------------------------")
            println("")
        }
    }

    fun buscarPaciente(dni: Int): Persona? {
        for (paciente in pacientes) {
            if (paciente.dninUMBER == dni) {
                return paciente
            }
        }
        return null
    }

    fun buscarMedicoPorServicio(servicio: Servicio, paciente: Persona) {
        for (medico in medicos) {
            if (medico.servicio == servicio) {
                var nuevaCita = Cita("20/05/2024", "10:00", paciente.nombre, medico.codigoEmpleado)
                citas.add(nuevaCita)

                println("Cita asignaada para el medico ${medico.nombre} el 20/05/2024 a las 10:00")
            }else {
                println("No hay un medico en este servicio")
            }
        }
    }

    fun mostrarLasCitasPorMedico(codigo: String) {
        for (cita in citas) {
            if (cita.doctor == codigo) {
                println("-------------------------------------")
                println("Fecha: ${cita.fecha}")
                println("Hora: ${cita.hora}")
                println("Paciente: ${cita.paciente}")
                println("-------------------------------------")
                println("")
            }
        }
    }

    fun verMedicosPorEspecialidad(especialidad: Especialidad) {
        for (medico in medicos) {
            if(medico.especialidad === especialidad) {
                println("Nombre del medico: ${medico.nombre}")
            }
        }
    }
}