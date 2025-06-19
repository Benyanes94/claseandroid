fun main() {
//    condicionesvotar()
//    condicionescomparar()
//    condicionessiespositivo()
//condicionalWhen()
//cicloFor()
//cicloWhile()
//cicloDoWhile()
//mostrarArreglo()
mostrarLista()


}



////////////////////////////////////////////
// aqui es para ver si se puede votar si es mayor o menor
fun condicionesvotar() {

    ///// 1. persona que pueda votar
    val edad = 17

    if (edad >= 18) {
        println("La persona puede votar.")
    } else {
        println("La persona NO puede votar.")
    }
}
/////////////////////////////////////////////
/// aqui es comparar de dos numeros
fun condicionescomparar() {

    val numero1 = 10
    val numero2 = 20

    if (numero1 > numero2) {
        println("$numero1 es mayor que $numero2")
    } else if (numero1 < numero2) {
        println("$numero1 es menor que $numero2")
    } else {
        println("$numero1 es igual a $numero2")
    }
}

/////////////////////////////////////////////
/// aqui es para ver si es positivo o negativo
fun condicionessiespositivo() {

    val numero = 5

    if (numero > 0) {
        println("El número $numero es positivo.")
    } else if (numero < 0) {
        println("El número $numero es negativo.")
    } else {
        println("El número es cero.")
    }
}


//////////////////////////////////////////////////////

/// aqui es condiciones when
/// hacer clasificacion de nota de un alumno de 0 a 10

fun condicionalWhen() {
    val calificacion = 1

    when (calificacion) {
        10 -> println("Excelente")
        9 -> println("Muy bien")
        7, 8 -> println("Bien")
        6 -> println("Suficiente")
        in 0..5 -> println("Reprobado")
        else -> println("Calificación inválida")
    }
}



//////////////////////////////////////////////////////

/// aqui es ciclo for
/// de numero de 1 a 100

fun cicloFor() {
    println("Números del 1 al 100:")
    for (i in 1..100) {
        println(i)
    }
}


//////////////////////////////////////////////////////

/// aqui es ciclo while
/// de numero de 1 hasta 50

fun cicloWhile() {
    println("contando de 1 a 50:")
    var contador = 1
    while (contador <= 50) {
        println(contador)
        contador++
    }
}

//////////////////////////////////////////////////////

/// aqui es ciclo do while
/// de 5 intento

fun cicloDoWhile() {
    println("5 intentos")

    var intentos = 1

    do {
        println("Intento $intentos")
        intentos++
    } while (intentos <= 5)
}




///////////////////////////////////////
//// arreglo
fun mostrarArreglo() {
    val nombres = arrayOf("benjamin", "jenifer", "luis", "gladys", "lester")

    println("Elementos son:")
    for (nombre in nombres) {
        println(nombre)
    }
}

////////////////////////////////////////////////////////////////////
////mostrar lista

fun mostrarLista() {
    val frutas = listOf("pera", "mango", "banano", "fresa", "uva")

    println("Elementos son:")
    for (fruta in frutas) {
        println(fruta)
    }
}


