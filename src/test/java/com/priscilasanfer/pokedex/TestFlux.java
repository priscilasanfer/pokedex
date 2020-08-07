package com.priscilasanfer.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class TestFlux {

    @Test
    public void testFlux1(){
        Flux.empty();
    }

    @Test
    public void testFlux2() {
        Flux<String> flux = Flux.just("Pokedex");
        flux.subscribe(System.out::println);
    }

    @Test
    public void testFlux3(){
        Flux<String> flux = Flux.just("Sharizard", "Blastoise", "Picachu");
        flux.subscribe(System.out::println);
    }
}
