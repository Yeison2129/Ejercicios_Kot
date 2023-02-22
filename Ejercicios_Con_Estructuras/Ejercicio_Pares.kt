//Ejercicio que le permita al usuario ingresar una cantidad de animales y ingresar su especie y saber que especie es.

    var (especie, tipo) = Pair("", "")
    println("Ingrese cantidad de animales a ingresar")
    var n = readLine()!!.toInt()
    var especies = arrayOfNulls<String>(n)
    var tipos = arrayOfNulls<String>(n)

    for (i in 0  until especies.size) {
            println("Ingrese un tipo de animal: ")
            tipo = readLine()!!
            print("Ingrese la especie del animal: ")
            especie = readLine()!!
            
            tipos[i] = tipo 
            especies[i] = especie
        }

    for (i in 0  until especies.size) {
                 println("El animal es de tipo ${tipos[i]} y es un/una ${especies[i]}")
            }
    

    var arrayNom = arrayOfNulls<String>(4)

    arrayNom[0] = "Andres"
    arrayNom[1] = "Pedro"
    arrayNom[2] = "juan"
    arrayNom[3] = "cristian"

    
   
    

