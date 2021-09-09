package com.devm.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableFeignClients
@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
	  return new WebMvcConfigurer() {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
		  registry.addMapping("/**").allowedMethods("*").allowedHeaders("*").allowedOrigins("*");
		}
	  };
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
