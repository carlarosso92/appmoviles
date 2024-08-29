//para poder usar una hoja para varios ejercicos se haca un fun main () {
// y luego  poner abajo fun main el nombre de las variables }
//pide al usuario que ingrese su edad e imprime si es mayor de edad o no
fun main(){
    print("Ingrese su edad: ")
    var edad = readln()?.toIntOrNull() ?:0
    if (edad >= 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }
}
