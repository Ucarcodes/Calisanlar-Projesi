package com.ucarcodes.calisanlarprojesi

class Calisanlar(val isim:String, var yas: Int, var departman : String, maas:Int) {

    private val maasPrivate: Int = maas

    fun maasGoster(): Int {
        return maasPrivate
    }

}