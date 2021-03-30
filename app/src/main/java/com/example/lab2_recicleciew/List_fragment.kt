package com.example.lab2_recicleciew

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class List_fragment: Fragment() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Override
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_list, container, false)
        val recycler = fragmentView.findViewById<RecyclerView>(R.id.rv_film)
        val lnlymanager:LinearLayoutManager = LinearLayoutManager(context)
        val db = DataBase()
        CoroutineScope(Dispatchers.Main).launch {
            recycler.layoutManager = lnlymanager
            val j =db.getJSON()
            val datasets = db.getDB(j)
            recycler.adapter = CustomAdapter(datasets.toTypedArray()){ newsId ->
                val intent = Intent(activity,Tho_activiteies::class.java)
                intent.putExtra("newsId",newsId)
                startActivity(intent)
            }
        }
        return fragmentView
    }

}