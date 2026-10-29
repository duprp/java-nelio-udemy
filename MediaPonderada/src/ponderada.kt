//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite o valor de N1: ")
    val n1 = readln().toDouble()
    println("Digite o valor de N2: ")
    val n2 = readln().toDouble()
    println("Digite o valor de N3: ")
    val n3 = readln().toDouble()

    println("Digite o valor de P1: ")
    val p1 = readln().toDouble()
    println("Digite o valor de P2: ")
    val p2 = readln().toDouble()
    println("Digite o valor de P3: ")
    val p3 = readln().toDouble()

    forPonde(n1,n2,n3,p1,p2,p3)

    fun forPonde (n1: Double, n2: Double, n3: Double,p1: Double,p2: Double,p3: Double){

        val mp = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3)

        println("Meida ponderada: $mp")


    }


}