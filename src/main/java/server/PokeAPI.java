package server;


import models.Pokeballz;
import models.Pokemonz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/api/pokemonz")
public class PokeAPI {

    @PostMapping
    @ResponseBody
    public ModelAndView createPokemon(
            @RequestParam("name") String name,
            @RequestParam("type") String type,
            @RequestParam("number") String number
    ) {
        Pokemonz pokemonz = new Pokemonz(name, type, number);
        Pokeballz.ballz.put(pokemonz.id, pokemonz);
        return new ModelAndView("redirect:/pokemonz");

    }

    @GetMapping
    @ResponseBody
    public List<Pokemonz> getAllPokemon() {
        Collection<Pokemonz> ballz = Pokeballz.ballz.values();
        return new ArrayList<>(ballz);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Pokemonz getOnePokemon (@PathVariable("id") int id) {
        Pokemonz Pokething = Pokeballz.ballz.get(id);
        return Pokething;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Pokemonz updatePokemonz (
            @PathVariable
            @RequestBody String body
    ) {
        Gson gson = new Gson();
        Pokemonz newPokemonz =
    }
}


