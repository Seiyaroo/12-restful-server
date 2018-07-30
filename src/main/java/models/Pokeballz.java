package models;

import java.util.HashMap;
import java.util.Map;

public class Pokeballz {
    public static Map<Integer, Pokemonz> ballz;
    static {
        ballz = new HashMap<>();
        Pokemonz Pikachu = new Pokemonz("Pikachu", "Electric", "25");
        Pokemonz Arbok = new Pokemonz("Arbok", "Poison", "24");
        Pokemonz Mewtwo = new Pokemonz("Mewtwo", "Psychic", "150");
        Pokemonz Mew = new Pokemonz("Mew", "Psychic", "151");
        Pokemonz Lugia = new Pokemonz("Lugia", "Psychic && Flying", "249");

        ballz.put(Pikachu.id, Pikachu);
        ballz.put(Arbok.id, Arbok);
        ballz.put(Mewtwo.id, Mewtwo);
        ballz.put(Mew.id, Mew);
        ballz.put(Lugia.id, Lugia);
    }
}
