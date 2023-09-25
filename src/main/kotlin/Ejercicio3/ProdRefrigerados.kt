package Ejercicio3

class ProdRefrigerados(var codSuperAlimentaria:String, fechaCad: String, numLote:String) : Producto(fechaCad, numLote) {

    /*
    //Hago el getter y el setter de codSuperAlimentaria
    var codSuperAlimentaria: String = ""
        set(codSuperAlimentaria){
            var field = codSuperAlimentaria
        }
        get()= field
*/


    override fun mostrarInfo(){
        println("Codigo del organismo de supervisión alimentaria: $codSuperAlimentaria")
        println("Fecha de caducidad: $fechaCad")
        println("Numero de lote: $numLote")

    }
}