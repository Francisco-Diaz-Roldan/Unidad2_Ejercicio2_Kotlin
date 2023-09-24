class Humano (var nombre: String,  edad:Byte) :SerVivo(edad){
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