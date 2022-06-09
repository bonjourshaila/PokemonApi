package com.example.pokemonapi.servicios;
import com.example.pokemonapi.dto.AbilityDTO;
import com.example.pokemonapi.dto.HeldItemDTO;
import com.example.pokemonapi.dto.PokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PokeApiServicio {
    @Autowired
    private transient RestTemplate restTemplate;

    @Value("https://pokeapi.co/api/v2/pokemon/")
    private String URL;

    public String obtenerNombre(String nombre){
        ResponseEntity<PokemonDTO> pokemon = restTemplate.getForEntity(URL + "/" + nombre, PokemonDTO.class);
        return pokemon.getBody().getName();
    }

    public Integer obtenerId(String nombre){
        ResponseEntity<PokemonDTO> pokemon = restTemplate.getForEntity(URL + "/" + nombre, PokemonDTO.class);
        return pokemon.getBody().getId();
    }

    public String obtenerLocation(String nombre){
        ResponseEntity<PokemonDTO> pokemon = restTemplate.getForEntity(URL + "/" + nombre, PokemonDTO.class);
        return pokemon.getBody().getLocation_area_encounters();
    }

    public Integer obtenerBaseExp(String nombre){
        ResponseEntity<PokemonDTO> pokemon = restTemplate.getForEntity(URL + "/" + nombre, PokemonDTO.class);
        return pokemon.getBody().getBase_experience();
    }

    public List<AbilityDTO> obtenerAbilities(String nombre){
        ResponseEntity<PokemonDTO> pokemon = restTemplate.getForEntity(URL + "/" + nombre, PokemonDTO.class);
        return pokemon.getBody().getAbilities();
    }

    public List<HeldItemDTO> obtenerItems(String nombre){
        ResponseEntity<PokemonDTO> pokemon = restTemplate.getForEntity(URL + "/" + nombre, PokemonDTO.class);
        return pokemon.getBody().getHeld_items();
    }
}
