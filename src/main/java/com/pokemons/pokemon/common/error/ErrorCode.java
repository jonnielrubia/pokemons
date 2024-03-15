package com.pokemons.pokemon.common.error;

import lombok.Getter;

public class ErrorCode {
  @Getter
  private final String message;

  public ErrorCode(final String errorCode, final String message){
    this.message = message;
  }
}
