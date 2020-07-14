package com.priscilasanfer.pokedex.repository;

import com.priscilasanfer.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String> {
}
