package com.cristian.football_api.dto;

public class PlayerResponseDTO {
    private Long id;
    private String nome;
    private Integer numero;
    private String posicao;
    private String teamNome;

    public PlayerResponseDTO(Long id, String nome, Integer numero, String posicao, String teamNome) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        this.teamNome = teamNome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getTeamNome() {
        return teamNome;
    }
}

