package practice7

fun main() {

    println("${operacion(20, 20)} ${operacion(20f, 12f)}")

    test("JL-Gale", )

    funcionFuncion()

}

fun operacion(i: Float, j: Float) = i / j
fun operacion(i: Int, j: Int) = i + j

fun suma(i: Int, j: Int) = i + j
fun resta(i: Int, j: Int) = i - j
fun multiplicacion(i: Int, j: Int) = i * j
fun division(i: Int, j: Int) = i / j

fun test(name: String, saludo: String = "Hola que tal") {
    println("$saludo $name")
}

fun funcionFuncion() {
    print("Jhon")
    fun funcion() {
        print(" Doe")
    }
    funcion()
}