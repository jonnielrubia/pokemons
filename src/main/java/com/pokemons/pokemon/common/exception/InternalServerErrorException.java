package com.pokemons.pokemon.common.exception;

import com.pokemons.pokemon.common.error.ErrorCode;

public class InternalServerErrorException extends ErrorCode {
  public InternalServerErrorException(){
    super("500","Internal Server Error.");
  }
}
