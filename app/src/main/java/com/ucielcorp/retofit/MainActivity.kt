package com.ucielcorp.retofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    //Funcion para obtener la temperatura mediante la api de OpenWeather
    private fun getTemperature(){
        /*Hay que realizar 3 pasos para poder trabajar con Retrofit
        * 1_Instanciar retrofit
        * 2_Hacemos la llamada a retrofit
        * 3_Obtenemos los datos que nos proporciana retrofit*/


        //1mer paso
        val retrofit = Retrofit.Builder()
            //Declaramos la URL que va a estar utilizando Retrofit
            .baseUrl("")
            //Realizamos la conversion de esa URL a un archivo JSON con GSON
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}