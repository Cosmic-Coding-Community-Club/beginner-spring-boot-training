package com.cccc.beginnerspringboottraining.infrastructure.pokemon

import com.cccc.beginnerspringboottraining.domain.pokemon.Pokemon

class PokemonMapper {
    
    fun map(pokemonDto: PokemonDto) = with(pokemonDto) {
        Pokemon(name, attack, defense, speed)
    }
    
    fun map(pokemon: Pokemon) = with(pokemon) {
        PokemonDto(name, attack, defense, speed)
    }
}