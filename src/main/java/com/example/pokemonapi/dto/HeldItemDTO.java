package com.example.pokemonapi.dto;

import java.util.List;

public class HeldItemDTO {
    private DetalleDTO item;
    private List<VersionDetailDTO> version_details;

    public DetalleDTO getItem() {
        return item;
    }

    public void setItem(DetalleDTO item) {
        this.item = item;
    }

    public List<VersionDetailDTO> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<VersionDetailDTO> version_details) {
        this.version_details = version_details;
    }
}


