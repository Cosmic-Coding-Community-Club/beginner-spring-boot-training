package com.cccc.beginnerspringboottraining.infrastructure.pokemon

import com.cccc.beginnerspringboottraining.domain.pokemon.Pokemon
import com.cccc.beginnerspringboottraining.domain.pokemon.PokemonRepository

class MemoryPokemonRepository : PokemonRepository {
    
    private val pokemons: MutableMap<String, Pokemon> = mutableMapOf()
    
    override fun get(name: String) =
        pokemons[name] ?: throw PokemonNotFoundException(name)
    
    override fun create(pokemon: Pokemon): Pokemon =
        pokemon.apply { pokemons[pokemon.name] = pokemon }
    
    
    override fun update(pokemon: Pokemon): Pokemon =
        pokemon.apply { pokemons[pokemon.name] = this }
    
    override fun delete(name: String): Pokemon =
        pokemons.remove(name) ?: throw PokemonNotFoundException(name)
}