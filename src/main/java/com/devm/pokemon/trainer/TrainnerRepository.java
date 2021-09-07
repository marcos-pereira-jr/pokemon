package com.devm.pokemon.trainer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainnerRepository extends MongoRepository<Trainner,String> {
    
}
