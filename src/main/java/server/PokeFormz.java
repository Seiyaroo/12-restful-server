package server;

import models.Pokeballz;
import models.Pokemonz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Controller
@RequestMapping("/pokemonz")
public class PokeFormz {
    @GetMapping
    public String showAllPokemon (Model model) {
        Collection<Pokemonz> pokemonz = Pokeballz.ballz.values();
        List<Pokemonz> list = new ArrayList<>(pokemonz);

        model.addAttribute("Pokemon", pokemonz);
        return "pokemon";
    }

    @GetMapping("/create")
    public String createPokemon () {
        return "create_pokemon";
    }

    @GetMapping("/{id}/edit")
    public String editPokemon (
            @PathVariable("id") int id,
            Model model
    ) {
        Pokemonz pokemonz = Pokeballz.ballz.get(id);

        model.addAttribute("id", pokemonz.id);
        model.addAttribute("name", pokemonz.name);
        model.addAttribute("type", pokemonz.type);
        model.addAttribute("number", pokemonz.number);

        return PokeFormz;
    }
}
