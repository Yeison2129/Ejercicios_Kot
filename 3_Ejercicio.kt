//4. La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del
// 50% en compras mayores o iguales a los $ 100.000 y un descuento del 10% en compras normales.
// Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente,
// en caso de que el descuento sea valido se debe informar al usuario indicando
// el valor descontado.


println("Ingrese el valor de su compra")

var valorCompra = readLine()!!.toDouble()
println("valor compra es : $valorCompra")

var desc=0.0

if (valorCompra>=100000){
    desc= valorCompra*0.5
    valorCompra -=desc
    println("el descuento aplicado es del 50% que equivale a : $desc")
}else{
    desc=valorCompra*0.1
    valorCompra -=desc
    println("el descuento aplicado es del 10% que equivale a : $desc")
}

println("Valor final de su compra es: $valorCompra ")