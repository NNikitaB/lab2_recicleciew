package com.example.lab2_recicleciew

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.annotation.WorkerThread
import coil.request.ImageRequest
import com.google.gson.Gson
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.HttpSend
import io.ktor.client.request.post
import io.ktor.client.request.request
import io.ktor.util.KtorExperimentalAPI
import io.netty.handler.codec.http.HttpResponse
import okhttp3.Request
import java.io.BufferedInputStream
import java.net.URL

import io.ktor.client.*
import io.ktor.client.engine.android.Android


//import io.ktor.client.features.logging.DEFAULT
//import io.ktor.client.features.logging.LogLevel
//import io.ktor.client.features.logging.Logger
//import io.ktor.client.features.logging.Logging
//

import java.net.Proxy
import java.net.InetSocketAddress

class DataBase(){
    private val port=3033
    private val ipadr="http://10.0.2.2:3033/"
    object Client {
        val client = HttpClient()
    }
    data class Film(var id :Int = 0, val title: String = "", val imageUrl: String = "", val releaseData: String = "", val genres: List<String> = listOf<String>(), val description: String = "")
    data class Films(val films:List<Film> = listOf<Film>())

    fun getDBid(json:String): Film {
         return Gson().fromJson(json, Film::class.java)
    }
    fun getDB(json:String): List<Film> {
        val a = Gson().fromJson(json, Films::class.java)
        //val b= a.films.map { myfilm -> ItemMy1(myfilm.id,myfilm.title,myfilm.releaseData,myfilm.genres,myfilm.imageUrl,myfilm.description)}
        return a.films
    }
    @WorkerThread
     suspend fun getJSON(urll: String=ipadr+"getFilms"):String
    {
        val t:String = Client.client.request(urll)
        return  t
    }
    @WorkerThread
    suspend fun getJSON(id : Int, url: String=ipadr+"getFilms/"):String
    {
        return getJSON(url+id.toString())
    }
}