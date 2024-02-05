package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var preuBaseTotal = 0.0
    var preuFinalTotal = 0.0
    var preuBaseRentadores = 0.0
    var preuFinalRentadores = 0.0
    var preuBaseTelevisions = 0.0
    var preuFinalTelevisions = 0.0

    val e1 = Electrodomestics(35.0, "blanc", "D", 2.0)
    val e2 = Electrodomestics(40.0, "platejat", "C", 8.0)
    val r1 = Rentadora(300.0, "blanc", "A", 5.0, 5)
    val r2 = Rentadora(450.0, "platejat", "B", 12.0, 8)
    val t1 = Televisio(200.0, "platejat", "E", 10.0, 52)
    val t2 = Televisio(315.0, "blanc", "F", 15.0, 28)

    println("E1:\n$e1 \nE2:\n$e2 \nE3:\n$r1 \nE4:\n$r2 \nE5:\n$t1 \nE6:\n$t2")

    preuBaseTotal += e1.preuBase + e2.preuBase
    preuFinalTotal += e1.preuFinal() + e2.preuFinal()

    preuBaseRentadores += r1.preuBase + r2.preuBase
    preuFinalRentadores += r1.preuFinal() + r2.preuFinal()

    preuBaseTelevisions += t1.preuBase + t2.preuBase
    preuFinalTelevisions += t1.preuFinal() + t2.preuFinal()

    println("""
        
        ELECTRODOMESTICS:
        Preu base: $preuBaseTotal€
        Preu final: $preuFinalTotal€
        
        RENTADORES:
        Preu base: $preuBaseRentadores€
        Preu final: $preuFinalRentadores€
        
        TELEVISIONS:
        Preu base: $preuBaseTelevisions€
        Preu final: $preuFinalTelevisions€
        
    """.trimIndent())
}