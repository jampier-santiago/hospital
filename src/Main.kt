import kotlin.random.Random

fun main() {
    menu()
}

fun menuUsuarios(hospital: Hospital) {
    println("-------------------------------------")
    println("Menu de usuarios")

    println("1. Registrar paciente")
    println("2. Registrar médico")
    println("3. Registrar empleado eventual")
    println("4. Registrar empleado fijo")

    println("5. Ver pacientes")
    println("6. Ver medicos")
    println("7. Ver empleados eventuales")
    println("8. Ver empleados fijos")
    println("9. Ver medicos por espcialidad")
    println("10. Regresar")

    val opcionMenu = readln().toInt()

    when(opcionMenu) {
        1 -> {
            println("Ingrese el nombre del paciente")
            val nombre = readln()
            println("Ingrese el DNI del paciente")
            val dni = readln().toInt()
            println("Ingrese la fecha de nacimiento del paciente")
            val fechaNacimiento = readln()
            println("Ingrese la dirección del paciente")
            val direccion = readln()
            println("Ingrese la ciudad del paciente")
            val ciudad = readln()

            val paciente = Persona(dni, nombre, fechaNacimiento, direccion, ciudad)
            hospital.pacientes.add(paciente)
        }

        2 -> {
            println("Ingrese el nombre del médico")
            val nombre = readln()
            println("Ingrese el DNI del médico")
            val dni = readln().toInt()
            println("Ingrese la fecha de nacimiento del médico")
            val fechaNacimiento = readln()
            println("Ingrese la dirección del médico")
            val direccion = readln()
            println("Ingrese la ciudad del médico")
            val ciudad = readln()
            println("Ingrese el código del médico")
            val codigo = readln()
            println("Ingrese la fecha de ingreso del médico")
            val fechaIngreso = readln()
            println("Ingrese el area del médico")
            val area = readln()

            println("Ingrese el número de consultorio del médico")
            val consultorio = readln().toInt()
            println("Ingrese la especialidad del médico (opciones: ${Especialidad.values().joinToString(", ")})")
            val especialidadInput = readln()
            val especialidad = Especialidad.valueOf(especialidadInput.uppercase())


            println("Ingrese el servicio de atención del médico (opciones: ${Servicio.values().joinToString(", ")})")
            val servicioInput = readln()
            val servicio = Servicio.valueOf(servicioInput.uppercase())

            val medico = Medico(dni, nombre, fechaNacimiento, direccion, ciudad, codigo, Random.nextInt(1, 10), fechaIngreso, area, "Medico", Random.nextInt(1000000, 2000000), Random.nextInt(1, 20), especialidad, servicio, consultorio)
            hospital.medicos.add(medico)
        }

        3 -> {
            println("Ingrese el nombre del empleado eventual")
            val nombre = readln()
            println("Ingrese el DNI del empleado eventual")
            val dni = readln().toInt()
            println("Ingrese la fecha de nacimiento del empleado eventual")
            val fechaNacimiento = readln()
            println("Ingrese la dirección del empleado eventual")
            val direccion = readln()
            println("Ingrese la ciudad del empleado eventual")
            val ciudad = readln()
            println("Ingrese el código del empleado eventual")
            val codigo = readln()
            println("Fecha ingreso del empleado eventual")
            val fechaIngreso = readln()
            println("Ingrese el área del empleado eventual")
            val area = readln()
            println("Ingrese el cargo del empleado eventual")
            val cargo = readln()

            val empleadoEventual = EmpleadoEventual(dni, nombre, fechaNacimiento, direccion, ciudad, codigo, Random.nextInt(1, 20), fechaIngreso, area, cargo, Random.nextInt(1, 10), Random.nextInt(1, 10), "2022-12-31")
            hospital.empleadoEventual.add(empleadoEventual)
        }

        4 -> {
            println("Ingrese el nombre del empleado fijo")
            val nombre = readln()
            println("Ingrese el DNI del empleado fijo")
            val dni = readln().toInt()
            println("Ingrese la fecha de nacimiento del empleado fijo")
            val fechaNacimiento = readln()
            println("Ingrese la dirección del empleado fijo")
            val direccion = readln()
            println("Ingrese la ciudad del empleado fijo")
            val ciudad = readln()
            println("Ingrese el código del empleado fijo")
            val codigo = readln()
            println("Fecha ingreso del empleado fijo")
            val fechaIngreso = readln()
            println("Ingrese el área del empleado fijo")
            val area = readln()
            println("Ingrese el cargo del empleado fijo")
            val cargo = readln()

            val empleadoFijo = EmpleadoPlanilla(dni, nombre, fechaNacimiento, direccion, ciudad, codigo, Random.nextInt(1, 20), fechaIngreso, area, cargo, Random.nextInt(1000000, 2000000), Random.nextInt(1, 10))
            hospital.empleadoPlanta.add(empleadoFijo)
        }

        5 -> {
            hospital.verPacientes()
        }

        6 -> {
            hospital.verMedicos()
        }

        7 -> {
            hospital.verEmpleadosEventuales()
        }

        8 -> {
            hospital.verEmpleadosPlanta()
        }

        9 -> {
            println("Digite la espcialidad: (opciones ${Especialidad.values().joinToString(", ")})")
            val especialidadInput = readln()
            val especialidad = Especialidad.valueOf(especialidadInput.uppercase())

            hospital.verMedicosPorEspecialidad(especialidad)
        }

        10 -> {
            menu()
        }

        else -> {
            println("Opción no válida")
            menuUsuarios(hospital)
        }
    }

}

fun menuCitas(hospital: Hospital) {
    println("-------------------------------------")
    println("Menu de citas")

    println("1. Registrar cita")
    println("2. Listar citas")
    println("3. Regresar")

    val opcionMenu = readln().toInt()

    when (opcionMenu) {
        1 -> {
            println("Digite el DNI del paciente")
            val dni = readln().toInt()

            if(hospital.buscarPaciente(dni) == null) {
                println("Paciente no encontrado")
                menuCitas(hospital)
            } else {
                println("Ingrese el servicio de la cita: (Opciones ${Servicio.values().joinToString(", ")})")
                val servicioInput = readln()
                val servicio = Servicio.valueOf(servicioInput.uppercase())

                val paciente = hospital.buscarPaciente(dni)!!

                hospital.buscarMedicoPorServicio(servicio, paciente)
            }
        }

        2 -> {
            println("Digite el codigo del medico")
            val dni = readln()

            hospital.mostrarLasCitasPorMedico(dni)
        }

        3 -> {
            menu()
        }

        else -> {
            println("Opción no válida")
            menuCitas(hospital)
        }
    }

}

fun menu() {
    val hospital = Hospital()
    var terminarPrograma: Boolean = false


    do {
        println("Menu del hostpital")

        println("1. Sección de usuarios")
        println("2. Registro de citas")
        println("3. Salir")

        val opcionMenu = readln().toInt()

        when(opcionMenu) {
            1 -> menuUsuarios(hospital)
            2 -> menuCitas(hospital)
            3 -> {
                println("Gracias por usar el sistema")
                terminarPrograma = true
            }

            else -> {
                println("Opción no válida")
                menu()
            }
        }
    } while (!terminarPrograma)
}