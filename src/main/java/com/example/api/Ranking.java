package com.example.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ranking implements Serializable {

    private String usuario;

    private Float valor;

    private Integer tempo;
}
