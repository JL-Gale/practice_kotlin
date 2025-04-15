package practice4

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
//    val num: Int = readln().toInt()
    var aux = 0;

    while (false) {
        aux++
        print("$aux ")
    }
    println("\n*******")

    aux = 0;
    while (false) {
        if (aux == 3) {
            break
        }
        println("Hello world");
        aux++;
    }

    // Expreciopnes de Rango
    var rango = 1..10
    val rango2 =  1..9

    if (5 in rango)
        println("El numero 5 esta en el rango")

    if (50 !in rango)
        println("El nunmero 50 no esta en el rango")

    for (i in rango) {
        print("$i ")
    }
    println(" ")
    for (i in 0..9) {
        print("$i ")
    }

    println("\n**********+")
    val nombre: String = "JoRgE"
    if (nombre.contains("ro",  ignoreCase = true)) {
        println("son iguales")
    }

    println("**********+")
    println("Igresa el numero de veces")
    try {
        var max = readln().toInt()
        for (i in 1..max) {
            print("$i ")
            delay(1000L)
        }
    } catch (e: NumberFormatException) {
        println("te las cagaste")
    }

    println("\n**********+")
    for (i in 0..10 step 2) {
        print("$i ")
    }

    println("\n**********+")
    var n = 100 downTo 0
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }

    println("\n**********+")
    for (i in 0 until 10) {
        print("$i ")
    }


}
    fun retardo(i: Int) {
        try {
            Thread.sleep(i * 1000L) //Pausa de s sagundos
        } catch (e: InterruptedException) {
            System.err.println("Error de concurencia " + e.message)
        }
    }

    fun test2 (i: Int): Int {
        return i
    }
