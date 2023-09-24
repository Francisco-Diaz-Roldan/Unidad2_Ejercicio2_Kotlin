package Ejercicio3

class ProdFrescos(var fechaEnvasado:String, var paisOrigen : String, fechaCad: String, numLote:String) : Productos(fechaCad, numLote) {

    override fun mostrarInfo(){
        println("Fecha de envasado: $fechaEnvasado")
        println("Pais de origen: $paisOrigen")
    }
}