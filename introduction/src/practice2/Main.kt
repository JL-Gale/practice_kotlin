package practice2

fun main() {

    println("Ingresa el numero 1")
    var num1: Int = readln().toInt()
    println("Ingresa el numero 2")
    var num2: Int = readln().toInt()
    println("Ingresa el numero 3")
    var num3: Int = readln().toInt()

    if (num1 > num2 && num1 > num3) {
        println("El numero $num1 es el mayor")
    } else if (num2 > num1 && num2 > num3) {
        println("El numero $num2 es el mayor")
    } else if (num3 > num1 && num3 > num2) {
        println("El numero $num3 es el mayor")
    } else if (num1 == num2 && num1 == num3) {
        println("Los numeros son iguales")
    } else if (num1 == num2 && num1 > num3) {
        println("Hay dos numero iguales pero el mayor $num1")
    } else if (num2 == num3 && num2 > num1) {
        println("Hay dos numero iguales pero el mayor $num2")
    } else if (num3 == num1 && num3 > num2) {
        println("Hay dos numero iguales pero el mayor $num3")
    }


}