//Ejercicio que pida al usuario la cantidad de numeros a ingresar y haga su promedio usando listas en kotlin

val numeros = mutableListOf<Int>()
var suma=0

println("Ingrese la cantidad de numeros a ingresar: ")
val cantidadNum = readLine()!!.toInt()

for(i in 1..cantidadNum){
    println("Ingrese el numero $i")
    val num = readLine()!!.toInt()
    numeros.add(num)
    suma +=num
}

val prom = suma/cantidadNum.toDouble()

println("Los numeros que usted ingreso son: $numeros")
println("La suma total de esos numeros es : $suma")
println("El promedio total de los numeros ingresados son: $prom")
