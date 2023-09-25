package Ejercicio3

class ProdCongelados(tempetaturaCongelacion:Double, fechaCad: String, numLote:String) : Productos(fechaCad, numLote) {

    //Hago el getter y el setter de tempetaturaCongelacion
    var tempetaturaCongelacion: Double = 0.0
        set(tempetaturaCongelacion){
            var field = tempetaturaCongelacion
        }
        get()= field



    override fun mostrarInfo(){
        println("Fecha de caducidad: $fechaCad")
        println("Numero de lote: $numLote")
        println("Temperatura de congelacion: $tempetaturaCongelacion")
    }


}