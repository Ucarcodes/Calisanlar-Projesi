package com.ucarcodes.calisanlarprojesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /* BTK Akademi Kotlin Programlama Dili Kursu Ödevi
           Hazırlayan Mevlüt Uçar (Ucarcodes)
        */


        val personelAhmet = Calisanlar("Ahmet",36,"Yazılım",31000)
        val personelSude = Calisanlar("Sude", 28, "İnsan Kaynakları", 25000)
        val personelFirat = Calisanlar("Firat", 41, "Donanım", 32000)
        val personelEda = Calisanlar("Eda", 37, "Donanım", 30000)
        val personelMehmet = Calisanlar("Mehmet", 25, "Yazılım", 25000)
        val personelSila = Calisanlar("Sıla", 23, "İnsan Kaynakları", 22500)
        val personelTayfun = Calisanlar("Tayfun", 32, "Yazılım", 29000)
        val personelCeyda = Calisanlar("Ceyda", 40, "İnsan Kaynakları", 28000)
        val personelMelih = Calisanlar("Melih", 24, "Donanım", 26000)
        val personelMelike = Calisanlar("Melike", 48, "Yazılım", 36000)

        val personelListesi = arrayListOf(personelAhmet,personelSude,personelFirat, personelEda
        ,personelMehmet,personelSila,personelTayfun,personelCeyda, personelMelih,personelMelike)


        val yasiOtuzdanBuyukVeYazilimcilarListesi = personelListesi.filter { (it.yas > 30) && (it.departman == "Yazılım")}.map {it.maasGoster()}.also { println("30 Yaşından Büyük ve Yazılım Departmanında Olanların Maaşları: ${it}")}
        val yasiYirmiBestenKucuklerListesi = personelListesi.filter { it.yas < 25 }.map { it.isim }.also { println("25 Yaşından Küçük Personellerin İsimleri: ${it}") }




    }
}