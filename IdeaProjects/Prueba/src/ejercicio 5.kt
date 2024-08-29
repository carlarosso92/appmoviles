//pide al usuario que ingrese su año de nacimiento luego calcula su edad actual e imprimela usar el readln()?.toIntOrNull() ?:0
fun main () {
    print("Ingrese el año de su nacimiento: ")
    var año = readln()?.toIntOrNull() ?:0
    println("Su edad actual es: ${2024 - año } años")
}