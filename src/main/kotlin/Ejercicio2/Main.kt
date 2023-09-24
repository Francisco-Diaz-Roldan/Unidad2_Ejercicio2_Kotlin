package Ejercicio2
/*En un archivo Main.kt, crear una función main(), crear dos cuentas pertenecientes a dos personas distintas (que
también debemos crear) y hacer un ingreso y un reintegro en cada cuenta. Imprimir los valores de las personas,
propietarios y transacciones.*/
fun main() {
    val p1 = Persona("Sergio","Sancho","999999999")
    val p2 = Persona("Sergio","Valero","6666666666")

    println("Persona 1: $p1")
    println("Persona 2: $p2")

    val c1 = Cuenta("0000000002",10000.52, p1)
    val c2 = Cuenta("1234567890", -6.5, p2)

    println(c1)
    println(c2)
}