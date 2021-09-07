package com.devm.pokemon.pokemon;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder   
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Pokemon {
    @Id
    private String id;
    private String name;
}
