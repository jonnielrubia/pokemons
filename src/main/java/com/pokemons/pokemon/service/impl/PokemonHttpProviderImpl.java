package com.pokemons.pokemon.service.impl;

import com.pokemons.pokemon.model.PokemonResponse;
import com.pokemons.pokemon.service.PokemonHttpProviderService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonHttpProviderImpl implements PokemonHttpProviderService {

  @Qualifier("restTemplate")
  private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(PokemonHttpProviderImpl.class);

    public Optional<ResponseEntity<PokemonResponse>> fetchFromApi(final String nameOrId)
            throws HttpClientErrorException {
      final String url = "https://pokeapi.co/api/v2/pokemon/"+nameOrId;

      try {
//        final ResponseEntity<String> getResponse = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        final var mapper = new ObjectMapper();
        final ResponseEntity<PokemonResponse> getResponse = restTemplate.exchange(url, HttpMethod.GET, null,PokemonResponse.class);
//        logger.info("Http response: {}", getResponse.getBody());
        return Optional.of(getResponse);
      } catch (final HttpClientErrorException exception) {
        logger.error("Fetch failed.");
        logger.error(exception.getMessage(), exception);
        throw exception;
      }
    }
}
