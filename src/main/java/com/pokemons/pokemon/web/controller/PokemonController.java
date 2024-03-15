package com.pokemons.pokemon.web.controller;

import com.pokemons.pokemon.common.error.ErrorCode;
import com.pokemons.pokemon.common.util.wrapper.ResponseWrapper;
import com.pokemons.pokemon.model.PokemonResponse;
import com.pokemons.pokemon.service.PokemonService;
import io.vavr.control.Either;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/pokemon")
public class PokemonController {

  private final PokemonService pokemonService;

  @GetMapping(value = "/{nameOrId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<ResponseWrapper<ErrorCode, PokemonResponse>> fetchFromApi(@PathVariable("nameOrId") String nameOrId){

    final ResponseEntity<ResponseWrapper<ErrorCode, PokemonResponse>> response;
    Either<ErrorCode, PokemonResponse> getResponse = pokemonService.fetchFromApi(nameOrId);

    if(getResponse.isLeft()){
      final HttpStatus httpStatus;
      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
      response = new ResponseEntity<>(new ResponseWrapper<>(getResponse.getLeft()),httpStatus);
    } else {
      response = ResponseEntity.ok(new ResponseWrapper<>(getResponse.get()));
    }
    return response;
  }
}
