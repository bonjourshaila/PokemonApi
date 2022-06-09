package com.example.pokemonapi.dto;

import java.util.List;

public class PokemonDTO {
    private Integer id;
    private String name;
    private String location_area_encounters;
    private Integer base_experience;
    private List<AbilityDTO> abilities;
    private List<HeldItemDTO> held_items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public List<AbilityDTO> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilityDTO> abilities) {
        this.abilities = abilities;
    }

    public List<HeldItemDTO> getHeld_items() {
        return held_items;
    }

    public void setHeld_items(List<HeldItemDTO> held_items) {
        this.held_items = held_items;
    }
}
