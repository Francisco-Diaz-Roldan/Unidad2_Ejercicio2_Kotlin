package Ejercicio1
    /*Ejercicio 1
a) Implementar las clases SerVivo y Humano en Kotlin.
El método mayor DEBE DEVOLVER un objeto de la clase SerVivo.
En el caso de la versión del método mayor que está en la clase SerVivo va
a devolver al SerVivo (de entre los dos que se comparan) de MAYOR EDAD.
En el caso de la versión del método que se encuentra en la clase Humano
DEBERÁ DEVOLVER al humano (de entre los dos que se comparan) cuya
edad sea mayor. En caso de tener la misma edad, devolverá al humano
cuyo nombre sea más largo.
El método toString() DEBE devolver un String que contenga TODOS los
datos del objeto.
Para implementar el método equals DEBES SABER QUE:
• Dos seres vivos se consideran iguales si tienen la misma edad
• Dos humanos se consideran iguales si tienen la misma edad y el
mismo nombre.*/

    open class SerVivo(var edad : Byte){

        fun equals(otro : SerVivo) : Boolean{
           return this.edad.equals(otro.edad)
        }

        open fun mayor(otro : SerVivo) : SerVivo {
            return if(this.edad>=otro.edad){
                this
            }else{
                otro
            }
        }

        override fun toString():String{
            return "edad: $edad"
        }
    }


