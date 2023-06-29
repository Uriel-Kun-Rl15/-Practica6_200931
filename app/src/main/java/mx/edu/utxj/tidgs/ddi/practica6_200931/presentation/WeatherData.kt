package mx.edu.utxj.tidgs.ddi.practica6_200931.presentation

import java.security.Principal

data class WeatherData(
    val tiempo: List<Tiempo>,
    val principal: Principal
)

data class Tiempo(
    val main: Main
)

data class Main(
    val temp: Float
)
