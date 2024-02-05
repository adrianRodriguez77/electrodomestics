package org.example

import com.sun.prism.paint.Color

open class Electrodomestics {
    var preuBase = 0.0
    var color = ""
    var consum = ""
    var pes = 0.0

    constructor(preuBase: Double){
        this.preuBase = preuBase
    }
    constructor(preuBase: Double, color: String, consum: String, pes: Double) : this(preuBase) {
        this.color = color
        this.consum = consum
        this.pes = pes
    }

    open fun preuFinal(): Double{
        var preuFinal = preuBase
        when(consum){
            "A" -> preuFinal += 35
            "B" -> preuFinal += 30
            "C" -> preuFinal += 25
            "D" -> preuFinal += 20
            "E" -> preuFinal += 15
            "F" -> preuFinal += 10
        }
        when(pes){
            in 0.0..6.0 -> preuBase
            in 6.0..20.0 -> preuFinal += 20
            in 20.0..50.0 -> preuFinal += 50
            in 50.0..80.0 -> preuFinal += 80
            else -> preuFinal += 100

        }
        return preuFinal
    }
    override fun toString(): String {
        return "Preu Base: $preuBase€ \nColor: $color \nConsum: $consum \nPes: $pes kg \nPreu final: ${preuFinal()}€"
    }
}

class Rentadora: Electrodomestics{
    protected var carrega = 0

    constructor(preuBase: Double, color: String, consum: String, pes: Double, carrega: Int): super(preuBase, color, consum, pes){}

    override fun preuFinal(): Double {
        var preuFinal = super.preuFinal()
        when(carrega){
            in 6..7 -> preuFinal += 55
            8 -> preuFinal +=70
            9 -> preuFinal += 85
            10 -> preuFinal += 100
        }
        return preuFinal
    }
}

class Televisio(preuBase: Double, color: String, consum: String, pes: Double, var mida: Int = 28) :
    Electrodomestics(preuBase, color, consum, pes) {

    override fun preuFinal(): Double {
        var preuFinal = super.preuFinal()

        when {
            mida in 29..32 -> preuFinal += 50
            mida <= 42 -> preuFinal += 100
            mida <= 50 -> preuFinal += 150
            else -> preuFinal += 200
        }

        return preuFinal
    }
}