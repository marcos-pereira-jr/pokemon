package com.devm.pokemon.pokemon;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokemonRepository extends MongoRepository<Pokemon,String> {
    
}
