package com.cccc.beginnerspringboottraining.domain.pokemon

interface PokemonRepository {
    
    fun get(name : String): Pokemon
    fun create(pokemon: Pokemon): Pokemon
    fun update(pokemon: Pokemon): Pokemon
    fun delete(name: String) : Pokemon
}