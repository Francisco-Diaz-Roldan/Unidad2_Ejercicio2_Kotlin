package Ejercicio3

fun main(){
    val producto = Productos("31-04-2023","012345Z")
    val productoFresco = ProdFrescos("01-02-2023", "España", "31-06-2023", "123456A")
    val productoRefrigerado = ProdRefrigerados("ABC0789", "31-12-2023", "987654B")
    val productoCongelado = ProdCongelados(-17.5, "31-12-2025", "456789C")

    println("Informacion del Producto:")
    producto.mostrarInfo()
    println()

    println("Informacion del Producto Fresco:")
    productoFresco.mostrarInfo()
    println()

    println("Informacion del Producto Refrigerado:")
    productoRefrigerado.mostrarInfo()
    println()

    println("Informacion del Producto Congelado:")
    productoCongelado.mostrarInfo()

}