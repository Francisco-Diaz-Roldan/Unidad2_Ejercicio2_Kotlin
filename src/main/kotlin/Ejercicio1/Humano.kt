package Ejercicio1
/*b) En un archivo Main.kt, crear una función main() que cumpla con las
siguientes instrucciones:
• Declarar DOS objetos de la clase SerVivo:
• Objeto X tiene 3 años
• Objeto Y tiene 5 años.
• Usando el método mayor() DEBERÁ imprimir el mayor SerVivo de los
creados anteriormente.
• Crear DOS OBJETOS DE LA CLASE Humano y ASIGNARLOS A LAS
VARIABLES DECLARADAS PREVIAMENTE. Los objetos son:
• Objeto X: nombre Homero, 34 años
• Objeto Y: nombre Bart, 9 años
• Usando el resultado devuelto por el método mayor() DEBERÁ imprimir
el mayor Humano de los creados anteriormente.*/
class Humano (var nombre: String, edad:Byte) : SerVivo(edad){
     fun equals(otro : Humano) : Boolean{
        return this.edad == otro.edad && this.nombre == otro.nombre
     }

     fun mayor(otro: Humano): Humano {
        return super.mayor(otro) as Humano
    }

    override fun toString(): String {
        return "nombre: $nombre, ${super.toString()}"
    }
}