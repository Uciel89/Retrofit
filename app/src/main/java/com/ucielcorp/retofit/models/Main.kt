package com.ucielcorp.retofit.models

//Vamos a cololar todos los elementos que se encuentran dentro del objeto Main del archivo JSON

class Main {

    //Valores de main
    private val temp: Double? = null
    private val feels_like: Double? = null
    private val temp_min: Double? = null
    private val temp_max: Double? = null
    private val pressure:Double? = null
    private val humidity:Double? = null


    //Date para cada uno de los valores de los valores de main
    fun getTemp(): Double?{
        return temp
    }
    fun getFeels_like(): Double?{
        return feels_like
    }
    fun getTemp_min(): Double?{
        return temp_min
    }
    fun getTemp_max(): Double?{
        return temp_max
    }
    fun getPressure(): Double?{
        return pressure
    }
    fun getHumidity(): Double?{
        return humidity
    }
}