package practice1

fun main() {

    // Numericos -> INT, LONG, SHORT, BYTE
    // Decimales -> FLOAT, DOUBLE
    // Boleamos -> BOOL
    // Cadena de Caracteres -> STRING
    // Caracter -> CHAR

    // Constantes - Variable inmutable
    val numerito: Int = 10
    println(numerito)
    val numeroF: Float = 10f
    println(numeroF)

    // Variables - Variables mutables
    var aux1: Int = 10
    var aux2: Float = 10f
    println("La variable 1 es: $aux1\nLa variable 2 es: $aux2")
    aux1 -= 10;
    println(aux1)

    // Entrada de datos
    println("Ingresa tu edad")
    try {
        // Condicional if - else
        var old: Byte = readln().toByte()
        if (old < 18)
            println("Eres menor")
        else
            println("Eres mayor")
    } catch (e: NumberFormatException) {
        println("Te pasaste rey")
    }

    // Ternario de kotlin
    var num1: Int = 10
    var num2: Int = 20
    var mayor: Int = if (num1 > num2) num1 else num2
    println("El numero mayor es: $mayor")
    println(if (num1 > num2) "EL numero $num1 es mayor que $num2" else "EL numero $num2 es mayor que $num1")


    // if - else if
    println("Ingresa tu nota")
    var nota: Float = readln().toFloat()
    if (nota >= 4 && nota <= 5) {
        println("Tu notas es superior")
    } else if (nota >= 3 && nota < 4) {
        println("Tu nata es basica")
    } else if (nota > 5 || nota < 0) {
        println("Nota equivacada")
    } else {
        println("Perdiste bruto del diablo")
    }

    // if else aninado
    if (nota >= 3) {
        print("Ganaste el curso tu nota es: ")
        if (nota < 4) {
            println("Tu nota es basica")
        } else {
            println("Tu nota es superior")
        }
    } else {
        println("Perdiste bruto del diablo")
    }



    // Condicional when - switch
    println("Ingresa el numero de la semana")
    try {
        var dia: Byte = readln().toByte()
        when (dia) {
            1.toByte() -> println("Lunes")
            2.toByte() -> println("Martes")
            3.toByte() -> println("Miercoles")
            4.toByte() -> println("Jueves")
            5.toByte() -> println("Viernes")
            6.toByte() -> println("Sabado")
            7.toByte() -> println("Domingo")
            else -> {
                println("Dia equivocado")
            }
        }
    } catch (e: NumberFormatException) {
        println("Te pasaste rey soy un byte")
    }


//    while (aux < 10) {
//    println("Hello world $aux")
//        aux++
//    }

}