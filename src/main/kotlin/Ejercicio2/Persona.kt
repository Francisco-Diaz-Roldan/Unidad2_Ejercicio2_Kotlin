package Ejercicio2
/*a) Crear una clase Persona, con los siguientes atributos:
• nombre
• apellido
• teléfono (controlar que el teléfono solo acepte 9 dígitos)*/
class Persona(var nombre:String, var apellido:String, var telefono:String) {

    /*
    //Hago el getter y el setter de nombre
    var nombre: String = ""
        set(nombre){
            nombre
        }
        get()= field


    //Hago el getter y el setter de apellido
    var apellido: String= ""
        set(apellido){
            apellido
        }
        get()= field


    //Hago el getter y el setter de telefono
    var telefono:String = ""
        set(telefono) {
            propietario
        }
        get()= field
 */

    init {
        if(telefono.length!=9){
            println()
            println("El telefono de $nombre $apellido debe tener 9 digitos")
            println("Por favor, $nombre $apellido, introduce un telefono valido")
            println()
        }
    }

    override fun toString():String{
        return "$nombre $apellido, Telefono: $telefono"
    }
}