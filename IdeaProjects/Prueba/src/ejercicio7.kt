//pide al usuario que ingrese una letra y luego que imprima si es una vocal o una consonante usando or ||

fun main (){
//letras()
    calificacion()
}

fun letras() {
    print("Ingresa una letra: ")
    val letra = readln().toLowerCase()
//VALIDAR EN CASO DE QUE SE INGRESE UN NUMERO
    if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
        println("la $letra es una vocal.")
    } else {
        println("la $letra es una consonante.")
    }
}

//pide al usuario que ingrese su calificacion  y que imprima si aprobo o no, considerar que la nota minima para pasar es 4.0 y la mayor 7.0

fun calificacion() {
    print("Ingrese su calificación: ")
    val nota = readLine()?.toDoubleOrNull() ?: 0.0
    if (nota in 4.0..7.0) {
        println("Usted ha aprobado!!")
    } else if (nota in 0.0..3.9) {
        println("Usted no ha aprobado")
    } else {
        println("el valor debe ser entre 0.0 y 7.0")
    }
}


