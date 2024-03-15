package com.pokemons.pokemon.service;

import com.pokemons.pokemon.model.PokemonResponse;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface PokemonHttpProviderService {
  Optional<ResponseEntity<PokemonResponse>> fetchFromApi(final String nameOrId);
}
