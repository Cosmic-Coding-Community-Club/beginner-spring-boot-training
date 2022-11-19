package com.cccc.beginnerspringboottraining.domain.pokemon.repository

import com.cccc.beginnerspringboottraining.domain.pokemon.model.Pokemon

interface PokemonRepository {
    
    fun get(name : String): Pokemon
    fun create(pokemon: Pokemon): Pokemon
    fun update(pokemon: Pokemon): Pokemon
    fun delete(name: String) : Pokemon
}