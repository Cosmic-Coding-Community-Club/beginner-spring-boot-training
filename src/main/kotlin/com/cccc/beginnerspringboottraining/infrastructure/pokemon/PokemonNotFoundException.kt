package com.cccc.beginnerspringboottraining.infrastructure.pokemon

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class PokemonNotFoundException(name: String) : RuntimeException("Pokemon Not found [$name]")