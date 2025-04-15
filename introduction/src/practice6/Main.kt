package practice6

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
//    for (i in 0..3) {
//    operacioneBasicas(20, 0)
//        delay(500L)
//    }

//    println("La suma de los valores 20 y  $valor2 es: ${valor1 + valor2}")
//    println("La resta de los valores $valor1 y  $valor2 es: ${valor1 - valor2}")
//    println("La multiplicacion de los valores $valor1 y  $valor2 es: ${valor1 * valor2}")
//    println("La devicion de los valores $valor1 y  $valor2 es: ${valor1 / valor2}")


    println(operacioneBasicas2(3.0F,2.0F))
}

fun test() {
    println("Ingresa un numero")
    var num = 0;
    try {
        num = readln().toInt()
        println("La multiplicacion de $num * $num es: ${squere(num)}")
    } catch (e : NumberFormatException) {
        println("Solo se aceptan numeros")
    }
}

fun squere(i: Int): Int {
    return i * i
}

fun operacioneBasicas(valor1: Int, valor2: Int) {
    println("Ingrese la oprecaion:\n1) Suma\n" +
            "2) Resta\n" +
            "3) Multiplicacion\n" +
            "4) Divicion")
    var operacion = 0;
    try {
        operacion = readln().toInt()
        when (operacion) {
            1 -> println("La suma de los valores $valor1 y  $valor2 es: ${valor1 + valor2}")
            2 -> println("La resta de los valores $valor1 y  $valor2 es: ${valor1 - valor2}")
            3 -> println("La multiplicacion de los valores $valor1 y  $valor2 es: ${valor1 * valor2}")
            4 -> {
                if (valor2 != 0) {
                    println("La devicion de los valores $valor1 y  $valor2 es: ${valor1 / valor2}")
                } else {
                    println("No se pude dividor por cero")
                }
            }
            else -> println("operacion no valida")
        }
    } catch (e: NumberFormatException) {
        println("Debe seleccionar el numero de la oparacion")
    }
}


fun operacioneBasicas2(valor1: Float, valor2: Float): Float{
    var resultado: Float = 0F;
    println("Ingrese la oprecaion:\n1) Suma\n" +
            "2) Resta\n" +
            "3) Multiplicacion\n" +
            "4) Divicion")
    var operacion = 0;
    try {
        operacion = readln().toInt()
        when (operacion) {
            1 -> resultado = valor1 + valor2
            2 -> resultado = valor1 - valor2
            3 -> resultado = valor1 * valor2
            4 -> {
                if (valor2 != 0F) {
                    resultado = (valor1 / valor2)
                } else {
                    println("No se pude dividor por cero")
                }
            }
            else -> println("operacion no valida")
        }
    } catch (e: NumberFormatException) {
        println("Debe seleccionar el numero de la oparacion")
    }
    return resultado
}