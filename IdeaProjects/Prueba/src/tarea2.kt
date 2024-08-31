// pide al usuario que ingrese un numero y luego imprime si es negativo positivo o cero, ademas hacer en azure
fun main() {
    print("Ingresa un número: ")
    val input = readLine() ?: "0"  // Leer la entrada del usuario
    val number = input.toIntOrNull() ?: 0  // Convertir a Int o usar 0 si la conversión falla

    if (number > 0) {
        println("El número es positivo.")
    } else if (number < 0) {
        println("El número es negativo.")
    } else {
        println("El número es cero.")
    }
}
