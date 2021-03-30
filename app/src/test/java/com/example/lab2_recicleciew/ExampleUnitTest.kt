package com.example.lab2_recicleciew

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
//    @Test
//    fun getjson(){
//        val str:String = "http://127.0.0.1:3033/getFilms"
//        val bd = DataBase()
//        val d = GlobalScope.launch{println(bd.getJSON(str)) }
//        Thread.sleep(4000L)
//    }
//    @Test
//    fun getjsonid(){
//        val str:String = "http://127.0.0.1:3033/getFilms/"
//        val bd = DataBase()
//        val d = GlobalScope.launch{println(bd.getJSON(1,str)) }
//        Thread.sleep(4000L)
//    }
//    @Test
//    fun parsejson(){
//        val str:String = "{\"films\":[{\"id\":0,\"title\":\"Смерть на Ниле|Death on the Nile\",\"imageUrl\":\"http://127.0.0.1:3033/image1.webp\",\"releaseData\":\"1999\",\"genres\":[\"Драма\",\"криминал\",\"детектив\"]},{\"id\":1,\"title\":\"Доктор Стрэндж и мультивселенная безумия|Doctor Strange in the Multiverse of Madness\",\"imageUrl\":\"http://127.0.0.1:3033/image2.webp\",\"releaseData\":\"2022\",\"genres\":[\"ужасы\",\"фантастика\",\"фэнтези\",\"боевик\",\"приключения\"]},{\"id\":2,\"title\":\"Дюна|Dune\",\"imageUrl\":\"http://127.0.0.1:3033/image3.webp\",\"releaseData\":\"2021\",\"genres\":[\"фантастика\",\"драма\",\"приключения\"]},{\"id\":3,\"title\":\"Вечные|Eternals\",\"imageUrl\":\"http://127.0.0.1:3033/image4.webp\",\"releaseData\":\"2021\",\"genres\":[\"фантастика\",\"фэнтези\",\"боевик\",\"драма\",\"приключения\"]},{\"id\":4,\"title\":\"Главный герой|Free Guy\",\"imageUrl\":\"http://127.0.0.1:3033/image5.webp\",\"releaseData\":\"2021\",\"genres\":[\"фантастика\",\"боевик\",\"комедия\",\"приключения\"]},{\"id\":5,\"title\":\"Мортал Комбат|Mortal Kombat\",\"imageUrl\":\"http://127.0.0.1:3033/image6.webp\",\"releaseData\":\"2021\",\"genres\":[\"боевик\",\"фэнтези\",\"фантастика\"]},{\"id\":6,\"title\":\"King’s Man: Начало|The King's Man\",\"imageUrl\":\"http://127.0.0.1:3033/image7.webp\",\"releaseData\":\"2021\",\"genres\":[\"боевик\",\"триллер\",\"комедия\",\"криминал\",\"приключения\"]},{\"id\":7,\"title\":\"Аватар 2|Avatar 2\",\"imageUrl\":\"http://127.0.0.1:3033/image8.webp\",\"releaseData\":\"2022\",\"genres\":[\"фантастика\",\"боевик\",\"триллер\",\"приключения\"]},{\"id\":8,\"title\":\"Форсаж 9|F9\",\"imageUrl\":\"http://127.0.0.1:3033/image9.webp\",\"releaseData\":\"2022\",\"genres\":[\"боевик\",\"триллер\",\"криминал\",\"приключения\"]},{\"id\":9,\"title\":\"Чёрная Вдова|Black Widow\",\"imageUrl\":\"http://127.0.0.1:3033/image10.webp\",\"releaseData\":\"2021\",\"genres\":[\"фантастика\",\"боевик\",\"приключения\"]},{\"id\":10,\"title\":\"Ковбой Бибоп|Kaubôi bibappu\",\"imageUrl\":\"http://127.0.0.1:3033/image11.webp\",\"releaseData\":\"1998-1999\",\"genres\":[\"аниме\",\"мультфильм\",\"фантастика\",\"боевик\",\"драма\",\"комедия\",\"криминал\"]},{\"id\":11,\"title\":\"Гравити Фолз|Gravity Falls\",\"imageUrl\":\"http://127.0.0.1:3033/image12.webp\",\"releaseData\":\"2012-2016\",\"genres\":[\"мультфильм\",\"комедия\",\"детектив\",\"приключения\",\"семейный\",\"фантастика\"]}]}"
//        val bd = DataBase()
//        val d = GlobalScope.launch{bd.getDB(str)}
//        //assertTrue(d.isEmpty())
//        Thread.sleep(4000L)
//        print(d.toString())
//    }
//    @Test
//    fun parsejsonid(){
//        val str:String = "{\"id\":1,\"title\":\"Доктор Стрэндж и мультивселенная безумия|Doctor Strange in the Multiverse of Madness\",\"imageUrl\":\"http://127.0.0.1:3033/image2.webp\",\"releaseData\":\"2022\",\"genres\":[\"ужасы\",\"фантастика\",\"фэнтези\",\"боевик\",\"приключения\"],\"description\":\"Рассмотрим проблему вычисления области пересечения Р П Q двух выпуклых полигонов Р и Q. За исключением особо оговоренных случаев будем предполагать, что два полигона пересекаются невырожденн\"}"
//        val bd = DataBase()
//        var d :ItemMy1
//        //val job= GlobalScope.launch{d =bd.getDBid(str)}
//        //d =bd.getDBid(str)}
//        Thread.sleep(8000L)
//
//        println(str)
//
//        //assertFalse(d.isEmpty())
//    }
//    @Test
//    fun getItem(){
//          print("hk")
//        GlobalScope.launch{
//            val str = "http://127.0.0.1:3033/image2.webp"
//            val bd = DataBase()
//            val b = bd.getImag1(str)
//            print(b.toString())
//        }
//        Thread.sleep(5000L)
//        //print(b.toString())
//    }
}