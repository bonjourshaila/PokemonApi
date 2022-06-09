package com.example.pokemonapi.controlador;

import com.example.pokemonapi.dto.AbilityDTO;
import com.example.pokemonapi.dto.HeldItemDTO;
import com.example.pokemonapi.servicios.PokeApiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokeApiControlador {

    @Autowired
    private transient PokeApiServicio pokeApiServicio;
    @GetMapping("/{pokemon}/name")
    public String buscarNombre(@PathVariable("pokemon") String pokemon){
        return pokeApiServicio.obtenerNombre(pokemon);
    }

    @GetMapping("/{pokemon}/id")
    public Integer buscarId(@PathVariable("pokemon") String pokemon){
        return pokeApiServicio.obtenerId(pokemon);
    }

    @GetMapping("/{pokemon}/location-area-encounters")
    public String buscarLocation(@PathVariable("pokemon") String pokemon){
        return pokeApiServicio.obtenerLocation(pokemon);
    }

    @GetMapping("/{pokemon}/base-experience")
    public Integer buscarBaseExp(@PathVariable("pokemon") String pokemon){
        return pokeApiServicio.obtenerBaseExp(pokemon);
    }

    @GetMapping("/{pokemon}/abilities")
    public List<AbilityDTO> buscarAbilities(@PathVariable("pokemon") String pokemon){
        return pokeApiServicio.obtenerAbilities(pokemon);
    }

    @GetMapping("/{pokemon}/held-items")
    public List<HeldItemDTO> buscarItems(@PathVariable("pokemon") String pokemon){
        return pokeApiServicio.obtenerItems(pokemon);
    }


}
