//pide al usuario que ingrese un numero entero y luego imprime ese numero multiplicado por dos
fun main() {
    print("Ingrese un número entero: ")
    val numero = readln().toInt()
    val resultado = numero * 2
    println("Su número multiplicado por dos es: $resultado")
}

/* //se usa esta forma tAmbien con una linea menos de codigo
fun main() {
    print("Ingrese un número entero: ")
    val numero = readln()?.toIntOrNull() ?:0
    println("El doble de $numero es ${numero * 2}")
}
 */

