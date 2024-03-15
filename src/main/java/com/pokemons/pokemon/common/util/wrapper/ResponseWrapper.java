package com.pokemons.pokemon.common.util.wrapper;

import com.pokemons.pokemon.common.error.ErrorCode;
import lombok.Getter;

@Getter
public class ResponseWrapper<E extends ErrorCode, R> {

  private R response;
  private final E error;
  private final Status status;

  @SuppressWarnings("unchecked")
  public ResponseWrapper(final E error) {
    this.error = error;
    this.status = Status.FAILED;
    this.response = null;
  }

  @SuppressWarnings("unchecked")
  public ResponseWrapper(final R response) {
    this.response = response;
    this.error = (E) new SuccessErrorCode();
    this.status = Status.SUCCESS;
  }

  @SuppressWarnings("unchecked")
  public static class SuccessErrorCode extends ErrorCode {
    SuccessErrorCode() {
      super("" ,"SUCCESS");
    }
  }

  public enum Status {
    SUCCESS, FAILED
  }
}
