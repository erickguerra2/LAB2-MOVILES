//Erick Guerra
//carne: 23208
//Laboratorio#2 - Plataformas moviles

fun main() {
    //calcular promedio
    val numeros = listOf(1, 2, 3, 4, 5)
    fun calcularpromedio(numeros: List<Int>):
            Double {
        if (numeros.isEmpty()) return 0.0

        return numeros.reduce { acc, num -> acc + num }.toDouble() / numeros.size
    }

    val promedio = calcularpromedio(numeros);
    println("El promedio es: $promedio")

    //mostrar los impares
    val enteros = listOf(1, 2, 3, 4, 5);
    val impares = enteros.filter { it % 2 != 0 };
    println("Impares: $impares")

    //buscar un palindromo
    fun isPalindrome(palabra: String): Boolean {
        val cadena = palabra.toLowerCase().filter{ it.isLetterOrDigit() }
        return cadena == cadena.reversed()
    }
    println(isPalindrome("Anita lava la tina"))

    //Saludar a las personas de la lista
    val nombres = listOf("Juan", "Maria", "Pedro", "Ana", "Luis")
    val saludos = nombres.map { name -> "¡Hola, $name!" }
    println(saludos)

    //Operacion con lambda
    fun performOperation(numero1: Int, numero2: Int, operation: (Int, Int) -> Int): Int {
        return operation(numero1, numero2)
    }
    val operacion = performOperation(5, 8){ num1, num2 -> num1 - num2 }
    println("Suma: $operacion")

    //funcion de mapeo
    data class Person(val name: String, val age: Int, val gender: String)
    data class Student(val name: String, val age: Int, val gender: String, val
    studentId: String)

    val persona1 = Person("Juan", 25, "Male")

    fun mapeo(persona: Person): Student {
        return Student(persona.name, persona.age, persona.gender, "123456")
    }
    val estudiante1 = mapeo(persona1)
    println("El estudiante ${estudiante1.name} tiene ${estudiante1.age} años")
}