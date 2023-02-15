//Algoritmo que calcule lo que gana un empleado con base a las horas
// trabajadas teniendo en cuenta que cada hora se paga a 2000, adicionalmente
// se le realiza unos descuentos con respecto a un impuesto de seguridad del 10% sobre su salario.

print("Ingrese sus horas trabajadas")
var horasTrabajadas=readLine()!!.toInt()
var valorHora=2000
var porc=0.1
var salario = horasTrabajadas*valorHora
println("El salario base es: $salario")
var descuento=salario*porc
println("se le realizara un descuento del 10% de: $descuento")
var salarioTotal=salario-descuento
println("salario total del empleado es de :$salarioTotal")