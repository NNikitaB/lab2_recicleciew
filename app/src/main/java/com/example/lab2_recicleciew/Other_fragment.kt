package com.example.lab2_recicleciew
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Other_fragment : Fragment(){
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
        val fragmentView = inflater.inflate(R.layout.other_fragment, container, false)
        val textViewName: TextView = fragmentView.findViewById(R.id.name_film)
        val textViewYear: TextView = fragmentView.findViewById(R.id.year_film)
        val textViewJanre: TextView = fragmentView.findViewById(R.id.janre_film)
        val prolog: TextView = fragmentView.findViewById(R.id.prolog)
        val imageView: ImageView = fragmentView.findViewById(R.id.image_film)
        val db =DataBase()

        CoroutineScope(Dispatchers.Main).launch {
            val h =arguments?.getInt("newsId")!!
            val it = db.getDBid(db.getJSON(h))
            textViewName.text = it.title
            textViewJanre.text =it.genres.toString()
            textViewYear.text =it.releaseData
            prolog.text=it.description
            //val v= "https://square.github.io/picasso/static/sample.png"
            Picasso.get().load(it.imageUrl).into(imageView)
        }
        return fragmentView

    }

}