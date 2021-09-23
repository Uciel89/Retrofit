package com.ucielcorp.retofit.interfaces

/*api.[openweathermap].org/data/2.5/[weather]?[q=London&appid]=[{API key}]*/

import com.ucielcorp.retofit.models.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//Con esta interface lo que vamos a hacer es mapear todos los elementos que yo necesito dentro del archivo json
interface OpenWeatherMap {

    //Elemento que voy a mapear
    @GET("weather")
    //El getWeather queda mapeado con el weather de la URL
    fun getWeather(
        /*Parametros "q" y "appid"*/
        //q -> es el nombre de la ciudad
        //Con el Query lo que hacemos es especificar esta propiedad que va a tener que respetar, pero internamente
        //Puedo cambiar, en este caso el nombre de la ciudad
        @Query("q") cityName: String?,

        //appid -> es la key que me da OpenWeather
        @Query("appid") ApiToken: String?

    /*Despues de que termino de mapear todos los elementos y obtener los que nosotros indicamos. Esto lo mapea con el objeto
    weather que a su ves tiene el objto main, que son los elemento que nosotros pediamos*/
    //Con Call asignamos su correspondiente objeto(en este caso Weather)
    ): Call<Weather>

}