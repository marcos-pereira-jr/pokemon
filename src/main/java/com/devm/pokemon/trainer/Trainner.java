package com.devm.pokemon.trainer;

import java.time.LocalDateTime;
import java.util.List;

import com.devm.pokemon.pokemon.Pokemon;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Builder 
@Data
@Document
public class Trainner {
    @Id
    private String id;
    private String name;

    @Indexed(unique = true)
    private String email;
    
    private Gender gender;
    private LocalDateTime created;
    
    @DBRef
    private List<Pokemon> pokemons;

}
