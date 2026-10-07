import kotlin.math.sqrt
fun baskara (b: Double, a: Double, c: Double){

    val raiz = (b * b) - (4 * a * c)

    val xpos= (-b + sqrt(raiz)) / (2*a)

    val xneg= (-b - sqrt(raiz)) / (2*a)

    println("X é igual a +$xpos e -$xneg")

}