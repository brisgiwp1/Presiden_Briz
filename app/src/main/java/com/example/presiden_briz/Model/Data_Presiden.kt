package com.example.presiden_briz.Model

import android.widget.Toast
import com.example.presiden_briz.Adapter.Presiden_List
import com.example.presiden_briz.R

object Data_Presiden {
    private val nama_Presiden = arrayOf(
        "Ir Soekarno",
        "Soeharto",
        "Bj Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "SBY",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Soekarno adalah presiden pertama indonesia",
        "Soeharto adalah presiden kedua indonesia",
        "Bj Habibie adalah presiden ketiga indonesia",
        "Abdurrahman Wahid adalah presiden ke empat indonesia",
        "Megawati adalah presiden kelima indonesia",
        "SBY adalah presiden ke enam indonesia",
        "Joko Widodo adalah presiden ke tujuh indonesia"
    )

    private val PresidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.harto,
        R.drawable.habibi,
        R.drawable.gus,
        R.drawable.wati,
        R.drawable.sby,
        R.drawable.joko
    )

    val Presiden_List: ArrayList<com.example.presiden_briz.Model.Presiden>
        get() {
            val list = arrayListOf<com.example.presiden_briz.Model.Presiden>()
            for (position in nama_Presiden.indices) {
                val Presiden = com.example.presiden_briz.Model.Presiden()
                Presiden.name = nama_Presiden[position]
                Presiden.detail = detail[position]
                Presiden.poster = PresidenPoster[position]
                list.add(Presiden)
            }
            return list
        }
}