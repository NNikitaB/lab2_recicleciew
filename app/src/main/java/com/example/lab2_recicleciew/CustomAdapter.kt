package com.example.lab2_recicleciew

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CustomAdapter(private val dataSet: Array<DataBase.Film>, private val onClickCallback: (Int) -> Unit) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val layoutView: RelativeLayout = view.findViewById(R.id.lay_item)
        val textViewName: TextView = view.findViewById(R.id.name_film)
        val textViewYear: TextView = view.findViewById(R.id.year_film)
        val textViewJanre: TextView = view.findViewById(R.id.janre_film)
        val imageView: ImageView = view.findViewById(R.id.image_film)
        var id:Int =5
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val it = dataSet[position]
        viewHolder.textViewName.text = it.title
        viewHolder.textViewJanre.text =it.genres.toString()
        viewHolder.textViewYear.text =it.releaseData
        Picasso.get().load(it.imageUrl).into(viewHolder.imageView)
        viewHolder.id = it.id
        Log.w("gg",position.javaClass.toString()+it.id.javaClass.toString())
        viewHolder.itemView.setOnClickListener{onClickCallback(viewHolder.id)}
    }

    override fun getItemCount() = dataSet.size
}

