package Ejercicio2
/*Crear una clase Cuenta, con los siguientes atributos:
• numeroCuenta
• saldo
• propietario. El propietario es un objeto tipo Persona.

La clase Cuenta debe tener un constructor con parámetros y otro sin parámetros, métodos getter y setter y debes
sobreescribir toString() para estas clases. Tenemos que controlar que el saldo de la cuenta no debe ser menor que 0.*/
class Cuenta(var numeroCuenta: String, var saldo: Double, var propietario:Persona) {

    init {
        while(saldo<0){
            println("El saldo minimo debe ser 0")
            println("Por favor, mete dinero en tu cuenta")
        }
    }
    constructor() : this("",0.0,Persona("","",""))

    /*fun geNumCuenta(): String {
        return this.numeroCuenta
    }

    fun getSaldo():Double{
        return this.saldo
    }

    fun getPropietario():Persona{
        return this.propietario
    }

    fun setNumCuenta(numeroCuenta: String){
        this.numeroCuenta=numeroCuenta
    }

    fun setSaldo(saldo: Double){
        this.saldo=saldo
    }

    fun setPropietario(propietario: Persona) {
         this.propietario=propietario
    }*/

    override fun toString():String{
        return "Numero de cuenta: $numeroCuenta, Saldo: $saldo, Propietario: $propietario"
    }

/*Crear un método llamado transaccion que tenga como parámetros cantidad y tipoTransaccion. El parámetro
tipoTransaccion puede ser “reintegro” o “ingreso”. Si es un reintegro, la cantidad se resta del saldo, y si es ingreso la
cantidad se incrementa al saldo. El método transacción debe imprimir el tipo de transacción y el nuevo saldo.*/
    fun transaccion(cantidad:Double, tipoTransaccion:String){
        if (tipoTransaccion == "reintegro"){
            if (cantidad<=saldo){
                saldo-=cantidad
                println("Operacion a realizar: Reintegro")
                println("Saldo tras operacion: $saldo")
            }else{
                println("No tienes tanto dinero en la cuenta, tieso")
            }
        }else if (tipoTransaccion == "ingreso"){
            saldo+=cantidad
            println("Operacion a realizar: Reintegro")
            println("Saldo tras operacion: $saldo")
        }else{
            println("Operacion no valida")
        }
    }
}