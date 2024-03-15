package com.pokemons.pokemon.service.impl;

import com.pokemons.pokemon.PokemonApplication;
import com.pokemons.pokemon.common.error.ErrorCode;
import com.pokemons.pokemon.common.exception.InternalServerErrorException;
import com.pokemons.pokemon.model.PokemonResponse;
import com.pokemons.pokemon.service.PokemonHttpProviderService;
import com.pokemons.pokemon.service.PokemonService;
import io.vavr.control.Either;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

  private static final Logger logger = LoggerFactory.getLogger(PokemonServiceImpl.class);

  @Qualifier("restTemplate")
  private final RestTemplate restTemplate;
  private final PokemonHttpProviderService pokemonHttpProviderService;

  public Either<ErrorCode, PokemonResponse> fetchFromApi (final String nameOrId){
    final Optional<ResponseEntity<PokemonResponse>> response;
    final Either<ErrorCode, PokemonResponse> finalResponse;
    response = pokemonHttpProviderService.fetchFromApi(nameOrId);
    if(response.isPresent()){
      finalResponse = Either.right(response.get().getBody());
    }else {
      finalResponse = Either.left(new InternalServerErrorException());
    }
    return finalResponse;
  }
}
