package Ejercicio3

class ProdFrescos(var fechaEnvasado:String, var paisOrigen : String, fechaCad: String, numLote:String) : Producto(fechaCad, numLote) {

    /*
    //Hago el getter y el setter de fechaEnvasado
    var fechaEnvasado: String = ""
        set(fechaEnvasado){
            var field = fechaEnvasado
        }
        get()= field

    //Hago el getter y el setter de paisOrigen
    var paisOrigen: String = ""
        set(paisOrigen){
            var field = paisOrigen
        }
        get()= field
*/

    override fun mostrarInfo(){
        println("Fecha de envasado: $fechaEnvasado")
        println("Pais de origen: $paisOrigen")
        println("Fecha de caducidad: $fechaCad")
        println("Numero de lote: $numLote")
    }
}