package generic;

import Pokemonster.*;
import fly.NoFly;
import fly.Wings;

import java.util.Arrays;
import java.util.List;

public class ListDemo04 {
    public static void main(String[] args) {
        List<Pokemon> pokemons =
                Arrays.asList(new Pikachu(new NoFly()), new Charizard(new Wings())
        );
        for (Pokemon pokemon : pokemons)
            pokemon.performFly();
    }
}
