package com.devm.pokemon.feign;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PokemonRequest {
    private Integer id;
    private String name;
    private Sprites sprites;

    @Data
    private class Sprites {
        @JsonProperty("back_default")
        private String backDefault;
        @JsonProperty("front_default")
        private String frontDefault;
    }
}
