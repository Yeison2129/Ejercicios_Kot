//Ejercicio donde use dos conjuntos de numeros y que en un tercer conjunto queden los numeros que
// coinciden en las otras dos listas
val numerosA = setOf(3, 4, 5, 6, 7)
val numerosB = setOf(9, 8, 5, 6, 7)

fun iguales(a: Set<Int>, b: Set<Int>): Set<Int> {
    val c = mutableSetOf<Int>()
    for (elemento in a) {
        if (elemento in b) {
            c.add(elemento)
        }
    }
    return c
}
val numerosIgualesAB = iguales(numerosA, numerosB)
println("Los numeros iguales de los conjuntos A y B es: $numerosIgualesAB")