package com.pokemons.pokemon.service;

import com.pokemons.pokemon.common.error.ErrorCode;
import com.pokemons.pokemon.model.PokemonResponse;
import io.vavr.control.Either;

public interface PokemonService {
  Either<ErrorCode, PokemonResponse> fetchFromApi(String nameOrId);
}
