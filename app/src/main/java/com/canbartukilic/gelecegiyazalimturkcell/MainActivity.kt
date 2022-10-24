package com.canbartukilic.gelecegiyazalimturkcell

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var degiskenAdi = 5

        // Sayısal
        // Tamsayı
        // Integer
        var d1 : Int = 45

        println(degiskenAdi)
        println(d1)

        // Kesirli
        var d2 : Float = 45.5f
        var d3 : Double = 45.6
        println(d2)
        println(d3)

        // Metinsel
        var d4 : String = "metin/24"
        var d5 : String = "icerik"
        println(d4)

        var d6 : String = d4 + " " + d5
        // Compcat
        println(d6)

        // Mantıksal
        var d7 : Boolean = true
        d7 = false

        d7 = 3 > 5

        println(d7)

        // Aciklama
        // cok satir
        /*
        Derlenmeyecek cok

         satirli aciklama.
        */

        // Kacis Karakterleri

        // Bir alt satira gecmek icin \n\"
        // Bir TAB boslugu kadar yer birakmak icin \t\"

        var ad = "Ad : " + "\t\"Ahmet\'"
        println(ad)

        // Aritmetik Operatorler
        // + - / *
        var d8 : Int = 56
        var d9 = 43
        var toplam = d8 + d9
        println(toplam)

        var bolum = d8 / d9
        println(bolum)

        // % mod = kalan

        var kalan = 5 % 3
        println(kalan)

        var sayac = 0
        sayac = sayac + 1
        sayac ++

        sayac --

        println(sayac)

        // Mantiksal
        /*
        <
        >
        <=
        >=
        ==
        !=
        &&
        ||
        !
        * */

        var d10 : Boolean = 3 < 5
        d10 = 5 <= 5
        d10 = 5 != 5
        println(d10)

        // &&
        // true && true = true
        // true && false = false
        // false && false = false
        // false && true = false

        d10 = true
        var veSonuc = 2 > 1 && d10
        println(veSonuc)

        // ||
        // true || true = true
        // true || false = true
        // false || false = false
        // false || true = true

        d10 = false
        var veyaSonuc = 2 > 1 || d10
        println(veyaSonuc)

        var d11 : Int = 10
        var d12 = 3

        var toplamSonuc : Float = d11.toFloat() / d12
        println(toplamSonuc)

        var d13 = "14"
        var d14 = d13.toInt()

        println(d14)

        var (a, b) = Pair(1, 3.4)
        println(a)
        println(b)

        var d15 : Int = 0

        println(d15)

        var yas : Int = 0

        println(yas)

        // Nullability

        var yasN : Int? = null
        yasN = 12
        println(yasN)

        var d16 = yasN * 10
        println(d16)
        */
        // if
        /*
        if (kosul) {
        // Kosul saglanirsa
        }
        else {
        // Kosul saglanmazsa
        }
         */

        /*
        var yas = 70

        if (yas < 20) {
            println("< 20")
        }
        else if(yas >= 20 && yas < 60) {
            println("20-60")
        }
        else {
            println(">= 20")
        }
        */
        /*
        // Bankacilik islemlerinden eft islemi yapilmak isteniyor.
        // Islem yapilacak gun ve saat bilgisinin mesai gunleri ve saatleri icinde olup olmamasina gore kullanicinin islemin yapilabilecegi en yakin zamanin bilgilendirilmesinin yapilmasi

        var kullaniciIslemGunu = 7 // Haftanin gunu 1.gun pazartesi
        var kullaniciIslemSaati = 19

        if (kullaniciIslemGunu > 0 && kullaniciIslemGunu <= 7) {

            if (kullaniciIslemGunu <= 5) {
                if (kullaniciIslemSaati > 0 && kullaniciIslemSaati <= 24) {
                    if (kullaniciIslemSaati >= 9 && kullaniciIslemSaati < 18) {
                            println("Isleminiz Gerceklestirilmistir.")
                    }
                    else {
                        if (kullaniciIslemGunu == 5) {
                            println("Isleminiz 2 gun sonra saat 9:00 da gerceklestirilecektir")
                        }
                        else {
                            println("Isleminiz yarin saat 9:00 gerceklestirilecektir")
                        }
                    }
                }
                else {
                    println("Gecersiz Saat")
                }
            }
            else if (kullaniciIslemGunu == 6) {
                println("Isleminiz 2 gun sonra saat 9:00 da gerceklestirilecektir")
            }
            else {
                println("Isleminiz yarin saat 9:00 gerceklestirilecektir")
            }
        }
        else {
            println("Gecersiz Gun")
        }
        */
        /*
        // when else
        when (deger) {
            1 => println("1")
        }
        */
        /*
        var d = 5
        when (d) {
            1 -> println("1")
            2 -> println("2")
            3 -> {
                println("3")
            }
            in 1..5 -> {
                println("1-5")
            }
            !in 1..5 -> {
                println("degil")
            }
            else -> {
                println("else")
            }
        }
        */
        // When ile ayni ornek
        // Bankacilik islemlerinden eft islemi yapilmak isteniyor.
        // Islem yapilacak gun ve saat bilgisinin mesai gunleri ve saatleri icinde
        // olup olmamasina gore kullanicinin islemin yapilabilecegi en yakin zamanin
        // bilgilendirilmesinin yapilmasi
    /*
        var kullaniciIslemGunu = 7 // Pazartesi 1.gun
        var kullaniciIslemSaati = 19

        when (kullaniciIslemGunu) {
            in 1..5 -> {
                when (kullaniciIslemSaati) {
                    in 9..17 -> {
                        println("Isleminiz yapilmistir")
                    }
                    in 0..8 -> {
                        println("Isleminiz bugun saat 9:00'da yapilacaktir")
                    }
                    in 18..24 -> {
                        when (kullaniciIslemGunu) {
                            5 -> {
                                println("Isleminiz 3 gun sonra saat 9:00'da yapilacaktir")
                            }
                            else -> {
                                println("Isleminiz yarin saat 9:00'da yapilacaktir")
                            }
                        }
                    }
                }
            }
            6 -> {
                println("Isleminiz 2 gun sonra saat 9:00'da yapilacaktir")
            }
            7 -> {
                println("Isleminiz yarin saat 9:00'da yapilacaktir")
            }
        }
     */
        // while
        /*while (kosul) {

        }
        */
    /*
        var sayac = 20

        while(sayac < 10) {
            sayac++
            println(sayac)
        }

        // do-while

        do {
            println(sayac)
        }
            while (sayac < 10)
    */
        /*
        for (i in 1..10) {
            println(i)
        }

        for (i : Int in 1..3) {
            println(i)
        }
        */

        // continue

        for (i in 1..10) {
            if (i == 5) {
                continue
            }
            println(i)
        }

        // break
        var sayac = 4

        sdf@for (i in 1..100) {
            eter@for (j in 1..10) {
                if (j == sayac) {
                    break@sdf
                }
            }
        }

    }
}