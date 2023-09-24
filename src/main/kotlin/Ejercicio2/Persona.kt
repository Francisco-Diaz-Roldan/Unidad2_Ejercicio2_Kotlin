package Ejercicio2
/*a) Crear una clase Persona, con los siguientes atributos:
• nombre
• apellido
• teléfono (controlar que el teléfono solo acepte 9 dígitos)*/
class Persona(var nombre:String, var apellido:String, var telefono:String) {
    init {
        while(telefono.length!=9){
            println("El telefono debe tener 9 digitos")
            println("Por favor, introduce un telefono valido")
        }
    }

    override fun toString():String{
        return "Nombre: $nombre, Apellido: $apellido, Telefono: $telefono"
    }
}