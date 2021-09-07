package com.devm.pokemon.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping(path = "/trainner",produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TrainnerController {
    private final TrainnerRepository repository;
    
    @GetMapping()
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> postMethodName(@RequestBody Trainner trainner) {
        
        Trainner iTrainner = repository.insert(trainner);
        return ResponseEntity.ok().body(iTrainner);
    }
    
}
