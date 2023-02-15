//- 3. Haga un algoritmo que solicite el numero de horas trabajadas de un empleado,
// teniendo que el valor de la hora es igual a $2000 calcule el salario base y realicele un
// descuento del 10% por concepto de derechos medicos, posteriormente solicite el tipo
// de empleado y realice el aumento del salario basado en la siguiente tabla:
//
//    Tipo A - Aumento del 30%
//
//    Tipo B - Aumento del 20%
//
//    Tipo C - Aumento del 10%
//
//     En caso de que el usuario no tenga un tipo definido, entonces no se le
//     realizará ningún aumento, indique cual seria el salario final basado en los
//     calculos anteriores.


println("Ingrese las horas trabajadas")
val horasTrabajadas=readLine()!!.toInt()
val tarifaHora=2000
var salario= horasTrabajadas*tarifaHora
println("su salario base es de $salario")
var por=0.1
var desc=salario*por
println("se realizara un descuento equivalente al 10% el cual es : $desc")
var salarioTotal=salario-(desc)
println("salario total a pagar sera: $salarioTotal")

print("ingrese que tipo de empleado es: (A,B,C) ")
val tipoEmpleado=readLine()
var porAumento=0.0
when(tipoEmpleado) {
    "a", "A" -> {
        porAumento = 30.0
        println("el empleado es tipo A")

    }

    "b", "B" -> {
        porAumento = 20.0
        println("el empleado es tipo B")

    }

    "c", "C" -> {
        porAumento = 10.0
        println("es tipo C")
    }
    else -> {
        println("No se le realizara ningun aumento ")
        porAumento = 0.0
    }
}
   if(porAumento!=0.0){
       val aunty = salarioTotal*(porAumento/100)
       salarioTotal=salarioTotal+aunty
       println("se realizo un $aunty equivalente al $porAumento")
       println("el salario final es de : $salarioTotal")
   }