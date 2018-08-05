package server;

import models.Pokeballz;
import models.Pokemonz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@Controller
@RequestMapping("/pokemonz")
public class PokeFormz {
    @GetMapping
    public String showAllPokemon (Model model) {
        Collection<Pokemonz> pokemonz = Pokeballz.ballz.values();
//        List<Pokemonz> list = new ArrayList<>(pokemonz);
        model.addAttribute("pokemonz", pokemonz);

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
        Pokemonz creature = Pokeballz.ballz.get(id);

        model.addAttribute("id", creature.id);
        model.addAttribute("name", creature.name);
        model.addAttribute("type", creature.type);
        model.addAttribute("number", creature.number);

        return "edit_pokemon";
    }
}
