//fun main () {
    //var nombre = "Marco"
    //val apellido = "Hurtado"

    /*
    operadores de asignacion
     = (asignacion simple): asigna valor de derecha a izquerda a la variable
        ejmplo
            numero = 5 (no quiere decir que numero sea igual a 5)

     +=(asignacion de suma):
        ejemplo
             numero += 5
    -=(asignacion de resta):
        ejemplo:
                numero -= 5

      *=(asignacion de multiplicacion
                numero *= 5

      /= (asignacion de division)
                numero /= 5


   */

/*  var resultado = (35 + 5)
  println(resultado)

  var numero = 5
  numero +=5
  println(numero)

}

 */

/*fun main () {
  val numero1 = 10
  val numero2 = 5

  println("Suma: ${numero1 + numero2}")
  println("Resta: ${numero1 - numero2}")
  println("Multiplicación: ${numero1 * numero2}")
  println("División: ${numero1 / numero2}")
  println("Módulo: ${numero1 % numero2}")
}

 */

//condiccionales

/*fun main () {
    val edad = 18

    if (edad >= 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }
}
 */

/*fun main(){
    for (i in 1..10) {
        println(i)
    }
}
 */


/*
fun sumar (a: Int, b: Int): Int {
    return a + b
}

fun main() {
     val resutado = sumar(5,7)
    println("la suma es: $resutado")
}
 */

//listas
/*fun main () {
    val numeros = listOf(1, 2, 3, 4, 5)
    var suma = 0

    for (numero in numeros) {
        suma += numero
    }
    println("La suma de la lista es: $suma")
}
 */

//clases y objetos val no es mustable es fijo y constante y var mutable a travez del tiempo, y es cambiante , tambien array es en plural, todas las clases deben partir con una mayuscula y las variables y constantes en minuscula y las listas en plural
/*
class Persona(val nombre: String, var edad: Int) {
    fun mostrarInformacion() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

fun main () {
    val persona = Persona("Ana",30)
    persona.mostrarInformacion()
}
 */


open class Persona(val nombre: String, var edad: Int) { //open class puede ser heredada
    fun mostrarInformacion() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

class Estudiante(nombre: String, edad: Int, val grado: String) : Persona(nombre, edad) {
    fun mostrarGrado() {
        println("Grado: $grado")
    }
}

fun main () { //el fun main es punto de partida para que funcione el codigo.
    val  estudiante = Estudiante ("Carla", 32, "Segundo año")
    estudiante.mostrarInformacion()
    estudiante.mostrarGrado()
}


