package com.cccc.beginnerspringboottraining.infrastructure.configuration

import com.cccc.beginnerspringboottraining.infrastructure.pokemon.MemoryPokemonRepository
import com.cccc.beginnerspringboottraining.infrastructure.pokemon.PokemonMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PokemonConfiguration {
    
    @Bean
    fun pokemonRepository() = MemoryPokemonRepository()
    
    @Bean
    fun pokemonMapper() = PokemonMapper()
}