// De un operario se conoce su sueldo y los años de antigüedad. Se pide crear
// un programa que lea los datos de entrada e informe:Si el sueldo es inferior a 500 y su antigüedad
// es igual o superior a 10 años, otorgarle un aumento del 20%, mostrar el sueldo a pagar.
//-Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%.
//-Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.

var sueldo:Float=0f
var antiguedad:Int=0
var aumento:Float=0f
var mensaje:String=""

sueldo=readLine()!!.toFloat()
println("Su sueldo es : $sueldo")
antiguedad=readLine()!!.toInt()
println("Su antiguedad es de: $antiguedad")

if(sueldo<500 && antiguedad>=10){
  aumento=sueldo*0.2f
  sueldo +=aumento
  mensaje="usted tiene un aumento del 20% y su sueldo es de $sueldo"
}else if(sueldo<500 && antiguedad<10){
    aumento=sueldo*0.05f
    sueldo +=aumento
    mensaje="usted tiene un aumenti del 5% y su nuevo sueldo es de : $sueldo"


}else{
    mensaje="usted no tiene ningun aumento su sueldo es de: $sueldo"
}

println(mensaje)