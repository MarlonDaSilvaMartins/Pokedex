/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marlon Martins
 * @since 07/05/2018 - 16:20
 * @vesion 1.0 red
 */
public class GinasioVO {
    
    private int idginasio;
    private String nome;
    private String localizacao;
    private String tipo;
    private String lider;
    private String insignia;

    public GinasioVO() {
    }

    public GinasioVO(int idginasio, String nome, String localizacao, String tipo, String lider, String insignia) {
        this.idginasio = idginasio;
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipo = tipo;
        this.lider = lider;
        this.insignia = insignia;
    }

    public int getIdginasio() {
        return idginasio;
    }

    public void setIdginasio(int idginasio) {
        this.idginasio = idginasio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getInsignia() {
        return insignia;
    }

    public void setInsignia(String insignia) {
        this.insignia = insignia;
    }

    @Override
    public String toString() {
        return "GinasioVO{" + "idginasio=" + idginasio + ", nome=" + nome + ", localizacao=" + localizacao + ", tipo=" + tipo + ", lider=" + lider + ", insignia=" + insignia + '}';
    }
}//fecha ginasio
