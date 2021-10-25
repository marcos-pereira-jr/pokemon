package com.devm.pokemon.pokemon;



import com.devm.pokemon.feign.PokemonServiceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.AllArgsConstructor;




@Api(value = "Pokemon", description = "Operations about pokemons")
@RestController
@RequestMapping(path = "/pokemon",produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PokemonController {

    private final PokemonRepository repository;
    private final PokemonServiceAPI pokemonServiceAPI;

    @ApiOperation(
        tags = "Pokemon",
        value = "Get all Pokemons",
        notes = "Pokemons saved in Database",
        response = Pokemon.class,
        responseContainer = "List",
        nickname = "getAllPokemon"
    ) 
    @ApiResponse(code = 200, message = "Pokemon saved")
    @GetMapping()
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> postMethodName(@RequestBody Pokemon pokemon) {
        Pokemon ipokemon = repository.insert(pokemon);
        return ResponseEntity.ok().body(ipokemon);
    }

    @GetMapping(value="/{name}")
    public ResponseEntity<?> getMethodName(@PathVariable String name) {
        return ResponseEntity.ok().body(pokemonServiceAPI.getPokemonByName(name));
    }
    
    
    
}
