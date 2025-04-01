package jogo;

public class Personagem {
    private String nome;
    private Integer vida;
    private Integer dano;

    public Personagem(String nome, Integer vida, Integer dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public Integer getDano() {
        return dano;
    }

    public String getNome() {
        return nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer atacar(){
       return getDano();
    }

}
