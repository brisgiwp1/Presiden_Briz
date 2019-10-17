package com.example.presiden_briz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.presiden_briz.Model.Data_Presiden
import com.example.presiden_briz.Model.Presiden
import com.example.presiden_briz.Adapter.Presiden_List

class MainActivity : AppCompatActivity() {

    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(R.id.rv_presiden)
        rvPresiden.setHasFixedSize(true)
        list.addAll(Data_Presiden.Presiden_List)
        showPresiden_List()
    }
        private fun showPresiden_List() {
            rvPresiden.layoutManager = LinearLayoutManager(this)
            rvPresiden.adapter = Presiden_List(this, list) {
                Toast.makeText(this, it.detail, Toast.LENGTH_SHORT).show();
            }
        }
}