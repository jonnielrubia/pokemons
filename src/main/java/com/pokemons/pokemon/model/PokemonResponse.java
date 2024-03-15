package com.pokemons.pokemon.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Abilities[] abilities;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer base_experience;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Cries cries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private NameAndUrl[] forms;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private GameIndices[] game_indices;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer height;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private boolean isDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String location_area_encounters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Moves[] moves;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer order;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private PastAbilities[] past_abilities;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private PasTypes[] pass_types;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private NameAndUrl species;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Sprites sprites;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer weight;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Stats[] stats;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Types[] types;

  @Data
  static class Abilities{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NameAndUrl ability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean isHidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer slot;

  }

  @Data
  static class NameAndUrl{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String url;
  }

  @Data
  static class Cries {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String latest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String legacy;
  }


  @Data
  static class GameIndices{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer gameIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NameAndUrl version;

  }


  @Data
  static class HeldItems{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NameAndUrl item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private VersionDetails[] versionDetails;
  }

  @Data
  static class VersionDetails{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer rarity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NameAndUrl version;
  }

  @Data
  static class Moves{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NameAndUrl move;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private VersionGroupDetails versionGroupDetails;
  }

  static class PastAbilities{

  }

  static class PasTypes {

  }

  @Data
  static class Sprites{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_shiny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_shiny_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Others others;
  }

  @Data
  static class Others{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DreamWorld dream_world;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Home home;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OfficialArtwork official_artwork;

    private Showdown showdown;
  }

  @Data
  static class DreamWorld{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_female;
  }

  @Data
  static class Home{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny_female;

  }

  @Data
  static class OfficialArtwork{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny;
  }

  static class Showdown{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_shiny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String back_shiny_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_female;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String front_shiny_female;
  }

  @Data
  static class Stats{
    private Integer base_stat;
    private Integer effort;
    private NameAndUrl stat;
  }

  @Data
  static class VersionGroupDetails{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer levelLearnedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NameAndUrl moveLearnMethod;
  }

  @Data
  static class Types{
    private Integer slot;
    private NameAndUrl type;
  }


}
