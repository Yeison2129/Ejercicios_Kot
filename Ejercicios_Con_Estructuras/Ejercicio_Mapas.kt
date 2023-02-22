//Ejercicio que guarde en un mapa diferentes animes y el usuario pueda seleccionarlo con su llave

 val Animes: Map<Int, String> = mapOf(1 to "One Piece", 2 to "Naruto",  3 to "Tokyo Ghoul", 4 to "Black Clover")

 for ((key, value) in Animes) {
  println("El codigo $key pertenece al Anime $value")
  }
   
    var preg = "si"
    do{
    println("Ingrese una clave para optener el Anime: ")
    var claves = readLine()!!.toInt()

    println(Animes.get(claves))

 println("Desea obtener otro Anime")
 preg = readLine()!!
 }while(preg == "si")
