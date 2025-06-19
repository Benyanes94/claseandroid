fun main() {
    // 1. Función que solo retorna el nombre "KOTLIN"
    fun obtenerLenguaje(): String {
        return "KOTLIN"
    }

    // 2. Función que solicita un parámetro y retorna un saludo
    fun saludarme(nombre: String): String {
        return "Hola, $nombre. ¡Bienvenido a Kotlin!"
    }

    // 3. Función que solicita 2 parámetros y retorna la suma
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    // 4. Función que solicita 2 parámetros y retorna la división
    fun division(a: Double, b: Double): Double {
        return if (b != 0.0) a / b else Double.NaN
    }

    // 5. Función que solicita 3 parámetros y retorna la multiplicación
    fun multiplicaciones(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }


    println(obtenerLenguaje())
    println(saludarme("Jonathan"))
    println("La suma de 5 + 10 es: ${suma(5, 10)}")
    println("La división de 10.0 / 2.0 es: ${division(10.0, 2.0)}")
    println("La multiplicación de 2 * 3 * 4 es: ${multiplicaciones(2, 3, 4)}")

}

