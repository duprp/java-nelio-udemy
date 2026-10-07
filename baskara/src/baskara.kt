import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite o valor de B: ")
    val b = readln().toDouble()
    println("Digite o valor de A: ")
    val a = readln().toDouble()
    println("Digite o valor de C: ")
    val c = readln().toDouble()

    baskara(b,a,c)

    fun baskara (b: Double, a: Double, c: Double){

        val raiz = (b * b) - (4 * a * c)

        val xpos= (-b + sqrt(raiz)) / (2*a)

        val xneg= (-b - sqrt(raiz)) / (2*a)

        println("X é igual a +$xpos e -$xneg")

    }


}