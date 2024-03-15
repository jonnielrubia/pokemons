package com.pokemons.pokemon.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

  @Primary
  @Bean(name = "restTemplate")
  public RestTemplate createRestTemplate(){
    final RestTemplate restTemplate = new RestTemplate();
    return restTemplate;
  }
}
