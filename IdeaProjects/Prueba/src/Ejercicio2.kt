//pide al usuario que ingrese su nombre y su edad y luedo imprime un mensaje que incluya ambos datos

fun main() {
    print("Ingrese su nombre")
    var nombre = readln()
    print ("Ingrese su edad")
    val edad = readln()
    println("Su nombre es:" + nombre + "y su edad: " + edad)
    println("Hola $nombre. Tienes $edad años.")
}