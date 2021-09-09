package com.devm.pokemon.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="pokemonServiceAPI",url = "https://pokeapi.co/api/v2")
public interface PokemonServiceAPI {
    
    @RequestMapping("/pokemon/{name}")
    PokemonRequest getPokemonByName(@PathVariable("name") String name);
}
