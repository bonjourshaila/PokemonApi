package com.example.pokemonapi.dto;

public class AbilityDTO {

    private DetalleDTO ability;
    private Boolean is_hidden;
    private Integer slot;

    public DetalleDTO getAbility() {
        return ability;
    }

    public void setAbility(DetalleDTO ability) {
        this.ability = ability;
    }

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }
}
