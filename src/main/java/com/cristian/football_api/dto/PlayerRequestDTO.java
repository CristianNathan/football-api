package com.cristian.football_api.dto;

import jakarta.validation.constraints.*;

public class PlayerRequestDTO {
    @NotBlank
    @Size(min=2,max=100)
    private String nome;

    @NotNull
    @Min(1)
    @Max(99)
    private Integer numero;

    @NotBlank
    @Size(min=2,max = 50)
    private String posicao;

    @NotNull @Positive
    private Long teamId;
    public PlayerRequestDTO(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
