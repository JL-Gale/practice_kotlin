package practice5

fun main() {

    var num1 = 10
    var num2 = 9
    var num3 = 8

    if (num1 > num2) {
        if (num1 > num3)
            println("El numero mayor es: $num1")
        else
            println("El numero mayor es: $num3")
    } else {
        if (num2 > num3)
            println("El numero mayor es: $num2")
        else
            println("El numero mayor es: $num3")
    }

    when {
        num1 > num2 && num1 > num3 -> println("El numero mayor es: $num1")
        num2 > num1 && num2 > num3 -> println("El numero mayor es: $num2")
        num3 > num2 && num3 > num1 -> println("El numero mayor es: $num3")
    }

    println("Ingresar el valor")
    var sueldo = readln().toInt()
    var total = 0;

    total += when{
        sueldo > 5000 -> {
            println("Sueldo alto")
            sueldo
        }
        sueldo > 3000 -> {
            println("Sueldo medio")
            0
        }
        sueldo > 1000 -> {
            println("Sueldo bajo")
            0
        }
        else -> {
            println("Sueldo bajo")
            0
        }
    }
    println(total)

    var dia = "Luns"
    when (dia.lowercase()) {
        "lunes" -> {
            println("Hoy es $dia")
        }
        "martes" -> {
            println("Hoy es $dia")
        }
        "miercoles" -> {
            println("Hoy es $dia")
        }
        "jueves" -> {
            println("Hoy es $dia")
        }
        "viernes" -> {
            println("Hoy es $dia")
        }
        else -> {
            println("Dia no encontrado")
        }
    }

}