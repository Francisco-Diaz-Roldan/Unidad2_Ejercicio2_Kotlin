package Ejercicio3

class ProdRefrigerados(var codSuperAlimentaria:String, fechaCad: String, numLote:String) : Productos(fechaCad, numLote) {

    override fun mostrarInfo(){
        println("Codigo del organismo de supervisión alimentaria: $codSuperAlimentaria")
    }
}