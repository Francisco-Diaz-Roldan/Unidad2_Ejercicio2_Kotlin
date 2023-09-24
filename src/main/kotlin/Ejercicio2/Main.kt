package Ejercicio2
/*En un archivo Main.kt, crear una función main(), crear dos cuentas pertenecientes a dos personas distintas (que
también debemos crear) y hacer un ingreso y un reintegro en cada cuenta. Imprimir los valores de las personas,
propietarios y transacciones.*/
fun main() {
    var p1 = Persona("Sergio","Sancho","999999999")
    var p2 = Persona("Sergio","Valero","666666666")

    println("Persona 1: $p1")
    println("Persona 2: $p2")
}