package com.example.agencyapi.model;

import jakarta.validation.constraints.NotBlank;

public class Agency {
    private String id;
    private String name;
    private String code;
    private String description;
    private String descriptionBd;
    @NotBlank
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @NotBlank
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @NotBlank
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionBd() {
        return descriptionBd;
    }

    public void setDescriptionBd(String descriptionBd) {
        this.descriptionBd = descriptionBd;
    }
}
