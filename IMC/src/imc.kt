
fun main() {
    println("Digite o peso: ")
    val peso = readln().toDouble()
    println("Digite a altura: ")
    val altura = readln().toDouble()

    formula(peso, altura)
}

fun formula(peso: Double, altura: Double){
    val imc = peso / (altura*altura)

    if (imc <= 18.5){
        println("Abaixo do peso")
        println(imc)
    }
    else if (18.5 < imc && imc <= 25){
        println("Peso normal")
    }
    else if(25 < imc && imc <= 30){
        println("Sobrpeso")
    }
    else if (30 < imc){
        println("Obesidade")
    }
    println("%.2f".format(imc))

}