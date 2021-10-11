package com.devm.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class PokemonApplication {


	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "It's working";
    }

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}
	
	// @Bean
	// CommandLineRunner runner(TrainnerRepository repository,MongoTemplate mongoTemplate){
	// 	return args ->{
			
	// 		Pokemon pokemon = Pokemon.builder().name("Teste").build();
	// 		Trainner trainner = Trainner.builder()
	// 									.email("marcos@gmail.com")
	// 									.name("Marcos")
	// 									.pokemons(Arrays.asList(pokemon))
	// 									.build();
	// 		Query query = new Query();
	// 		query.addCriteria(Criteria.where("email").is("marcos@gmail.com"));
	// 		List<Trainner> trainners = mongoTemplate.find(query,Trainner.class);

	// 	};
	// }

}
