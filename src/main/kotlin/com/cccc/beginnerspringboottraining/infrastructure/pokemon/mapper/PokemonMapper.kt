package com.cccc.beginnerspringboottraining.infrastructure.pokemon.mapper

import com.cccc.beginnerspringboottraining.domain.pokemon.model.Pokemon
import com.cccc.beginnerspringboottraining.infrastructure.pokemon.controller.PokemonDto

class PokemonMapper {
    
    fun map(pokemonDto: PokemonDto) = with(pokemonDto) {
        Pokemon(name, attack, defense, speed)
    }
    
    fun map(pokemon: Pokemon) = with(pokemon) {
        PokemonDto(name, attack, defense, speed)
    }
}