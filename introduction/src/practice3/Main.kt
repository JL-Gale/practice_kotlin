package practice3

fun main() {

    println("Ingresa el numero del mes")
    var mes: Int = readln().toInt()

    if (mes >= 1 && mes <= 3) {
        println("La fecha coresonte al primer trimestres")
    } else if (mes >= 4 && mes <= 6) {
        println("La fecha coresonte al segundo trimestres")
    } else if (mes >= 7 && mes <= 9) {
        println("La fecha coresonte al tercer trimestres")
    } else if (mes >= 10 && mes <= 12) {
        println("La fecha coresonte al cuarto trimestres")
    } else {
        println("mes equivocado")
    }

    if (mes == 1 || mes == 2 || mes == 3)
    println("La fecha coresonte al primer trimestres")
    if (mes == 4 || mes == 5 || mes == 6)
        println("La fecha coresonte al segundo trimestres")
    if (mes == 7 || mes == 8 || mes == 9)
        println("La fecha coresonte al tercer trimestres")
    if (mes == 10 || mes == 11 || mes == 12)
        println("La fecha coresonte al cuarto trimestres")
    else
    println("mes equivocado")


}