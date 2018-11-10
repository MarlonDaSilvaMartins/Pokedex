/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marlon Martins
 * @since 05/05/2018 - 23:11
 * @version 1.0 red
 */
public class PokemonVO {
    private int idpokemon;
    private String nome;
    private String tipo;
    private String categoria;
    private float peso;
    private float altura;
    private String habilidade;

    public PokemonVO() {
    }

    public PokemonVO(int idpokemon, String nome, String tipo, String categoria, float peso, float altura, String habilidade) {
        this.idpokemon = idpokemon;
        this.nome = nome;
        this.tipo = tipo;
        this.categoria = categoria;
        this.peso = peso;
        this.altura = altura;
        this.habilidade = habilidade;
    }

    public int getIdpokemon() {
        return idpokemon;
    }

    public void setIdpokemon(int idpokemon) {
        this.idpokemon = idpokemon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return "PokemonVO{" + "idpokemon=" + idpokemon + ", nome=" + nome + ", tipo=" + tipo + ", categoria=" + categoria + ", peso=" + peso + ", altura=" + altura + ", habilidade=" + habilidade + '}';
    }
}//fecha class
