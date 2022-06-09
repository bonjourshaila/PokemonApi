package com.example.pokemonapi.dto;

public class VersionDetailDTO {
    private Integer rarity;
    private DetalleDTO version;

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public DetalleDTO getVersion() {
        return version;
    }

    public void setVersion(DetalleDTO version) {
        this.version = version;
    }
}
