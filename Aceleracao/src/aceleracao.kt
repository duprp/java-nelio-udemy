fun main() {
    println("Para calcular a aceleracao digite")
    println("Valor de variaçao de velocidade vf: ")
    val vf = readln().toDouble()
    println("Valor de variaçao de velocidade vi: ")
    val vi = readln().toDouble()
    println("Valor de intervalo de tempo tf: ")
    val tf = readln().toDouble()
    println("Valor de intervalo de tempo ti: ")
    val ti = readln().toDouble()

    acelerecao(vf, vi, tf, ti)
}

fun acelerecao(vf: Double,vi: Double, tf: Double, ti: Double){

    if (tf == 0.0 && ti == 0.0){
        println("erro tf e ti nao poder ser 0")
    }

    val a = (vf - vi) / (tf - ti)
    println(a)


}