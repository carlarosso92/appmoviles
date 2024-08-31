//necesito un programa donde el usuario pueda  ingresar 4 notas  en el rango de 1 al 7
//y el programa debe tener lo siguiente
//Solicitar al usuario que ingrese las 4 notas, una por una
//validar que cada nota ingresada este dentro del rango permitido [(entre el 1 y eñ 7)
//Si el usuario ingresa una nota fuera de este rango, el programa debe mostrar un mensaje de error y finalizar.
//calcular el promedio de las 4 notas ingresadas
//determinar si el usuario aprueba o no. se considera aprobado si el promedio es mayor o igual a 4.0
//mostrar el mensaje en pantalla indicando el promedio obtenido y si el usuario aprobo o no.

fun main() {
    // se crea una lista para almacenar las notas (esto busque en un foro donde decia que para las notas
    //debe ser mutablelist, no se si esta bien o no o hay otra forma
    val notas: MutableList<Double> = mutableListOf()

    // Se le pide al usuario que ingrese sus notas con el bucle
    for (i in 1..4) {
        print("Por favor ingrese la nota $i (entre 1.0 y 7.0): ")
        val nota = readLine()?.toDoubleOrNull()

        // aca hay que validar, que las notas esten dentro del rango permitido usando if y or ||
        if (nota == null) {
            println("Error: La nota no es válida.")
            return
        }

        if (nota < 1.0 || nota > 7.0) {
            println("La nota debe estar entre 1.0 y 7.0.")
            return
        }

        //esto se agrega a la lista en una nota (tambien lo vi en un foro)
        notas.add(nota)
    }

    // ahora se calcula el promedio de loas notas tambien vi que se puede utulizar el .avarage()
    val promedio = notas.sum() / notas.size

    // acá se determina si el usuario aprobó o no
    val aprueba = promedio >= 4.0

    // y aca se imprime los mensajes ne pantalla
    println("Promedio: $promedio")
    if (aprueba) {
        println("¡Aprobado!")
    } else {
        println("No aprobado.")
    }
}