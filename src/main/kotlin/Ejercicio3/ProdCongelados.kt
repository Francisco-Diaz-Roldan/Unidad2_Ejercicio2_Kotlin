package Ejercicio3

class ProdCongelados(var tempetaturaCongelacion:Double, fechaCad: String, numLote:String) : Productos(fechaCad, numLote) {

     override fun mostrarInfo(){
        println("Temperatura de congelacion: $tempetaturaCongelacion")
    }

}