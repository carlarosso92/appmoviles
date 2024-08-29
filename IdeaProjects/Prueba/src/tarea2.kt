// pide al usuario que ingrese un numero y luego imprime si es negativo positivo o cero, ademas hacer en azure
fun main() {
    print("Ingresa un número: ")
    val input = readLine() ?: "0"  //
    val number = input.toIntOrNull() ?: 0

    when {
        number > 0 -> println("El número es positivo.")
        number < 0 -> println("El número es negativo.")
        else -> println("El número es cero.")
    }
}
