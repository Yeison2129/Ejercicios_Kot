//- 6. Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
//
//    1. Sumar
//    2. Restar
//    3. Multiplicar
//    4. Dividir
//    5. Finalizar
//
//    Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4


var opcion:Int=0
var num1:Float=0f
var num2:Float=0f

do {
    println("ingrese el primer numero:")
    num1= readLine()!!.toFloat()
    println("ingrese el segundo numero")
    num2= readLine()!!.toFloat()
    println("Elija una opcion del menu : \n 1.sumar \n 2.restar\n 3.multiplicar \n 4.dividir \n 5.Finalizar")
    opcion=readLine()!!.toInt()
    when(opcion){
        1->println("la suma es:${num1+num2}")
        2->println("la resta es:${num1-num2}")
        3->println("la multiplicacion es: ${num1*num2}")
        4->{
            if(num2<=0){
                println("el segundo numero no puede ser negativo o cero")

            }else{
                println("La division es ${num1/num2}")

            }


        }
        5->println("Programa finalizado")
        else->println("opcion invalida")

    }
}while(opcion!=5)
