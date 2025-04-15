package practice8

fun main() {


    var numero: IntArray = IntArray(10)

    for (i in 0 until 10) {
        numero[i] = 20
    }

    numero.forEach {i->print(i)}
}