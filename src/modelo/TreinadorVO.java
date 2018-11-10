/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 21:12
 * @version 1.0 red
 */
public class TreinadorVO {
    private int idtreinador;
    private String nome;
    private String sexo;
    private String cidade;
    private float altura;
    private int qtdinsignias;

    public TreinadorVO() {
    }

    public TreinadorVO(int idtreinador, String nome, String sexo, String cidade, float altura, int qtdinsignias) {
        this.idtreinador = idtreinador;
        this.nome = nome;
        this.sexo = sexo;
        this.cidade = cidade;
        this.altura = altura;
        this.qtdinsignias = qtdinsignias;
    }

    public int getIdtreinador() {
        return idtreinador;
    }

    public void setIdtreinador(int idtreinador) {
        this.idtreinador = idtreinador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getQtdinsignias() {
        return qtdinsignias;
    }

    public void setQtdinsignias(int qtdinsignias) {
        this.qtdinsignias = qtdinsignias;
    }

    @Override
    public String toString() {
        return "TreinadorVO{" + "idtreinador=" + idtreinador + ", nome=" + nome + ", sexo=" + sexo + ", cidade=" + cidade + ", altura=" + altura + ", qtdinsignias=" + qtdinsignias + '}';
    }    
}//fecha class

