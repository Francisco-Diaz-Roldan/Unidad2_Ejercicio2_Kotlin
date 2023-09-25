package Ejercicio3
/*Ejercicio 3
Crear un programa Kotlin que permita la gestión de una empresa agroalimentaria que trabaja con tres tipos de
productos: productos frescos, productos refrigerados y productos congelados.
Todos los productos llevan esta información común: fecha de caducidad (String) y número de lote. A su vez, cada
tipo de producto lleva alguna información específica. Los productos frescos deben llevar la fecha de
envasado(String) y el país de origen. Los productos refrigerados deben llevar el código del organismo de supervisión
alimentaria. Los productos congelados deben llevar la temperatura de congelación recomendada.
Crear el código de las clases Kotlin implementando una relación de herencia desde la superclase Producto hasta las
subclases ProductoFresco, ProductoRefrigerado y ProductoCongelado.
Cada clase debe disponer de constructor(es) y permitir establecer (set) y recuperar (get) el valor de sus atributos y
tener un método que permita mostrar la información del objeto.
Crear un archivo Kotlin Main con el método main donde se cree un objeto de cada tipo y se muestren los datos de
cada uno de los objetos creados.*/
open class Producto(fechaCad: String, numLote:String) {


    //Hago el getter y el setter de fechaCad
    open var fechaCad: String = ""
        set(fechaCad) {
            var field = fechaCad
            field = fechaCad
        }
        get()= field

    //Hago el getter y el setter de numLote
    open var numLote: String = ""
        set(numLote) {
            var field = numLote
        }
        get()= field


    open fun mostrarInfo(){
        println("Fecha de caducidad: $fechaCad")
        println("Numero de lote: $numLote")
    }


}