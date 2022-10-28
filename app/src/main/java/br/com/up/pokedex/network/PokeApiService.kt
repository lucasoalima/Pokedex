package br.com.up.pokedex.network

import br.com.up.pokedex.model.PokeResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokeApiService {

    @GET("pokemon?limit=151")
    fun getPokemons() : Call<PokeResponse>

    @GET("pokemon/5")
    fun getPokemonById() : Call<PokeResponse>

    @GET("pokemon/ditto")
    fun getPokemonByName() : Call<PokeResponse>

}