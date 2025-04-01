package jogo;

import java.util.ArrayList;

public class Batalha {
    private Personagem personagemSelecionado;
    private Inimigo inimigoSelecionado;
    private boolean sitBatalha = true;

    public Batalha(Personagem personagemSelecionado, Inimigo inimigoSelecionado){
        this.personagemSelecionado = personagemSelecionado;
        this.inimigoSelecionado = inimigoSelecionado;
    }

    public void iniciarBatalha() {

        while (inimigoSelecionado.getVida() > 1 && personagemSelecionado.getVida() > 1){
            System.out.println("O " + personagemSelecionado +" ataca com " + personagemSelecionado.atacar() + " de dano");
            inimigoSelecionado.setVida(inimigoSelecionado.getVida() - personagemSelecionado.atacar());
            System.out.println("O " + inimigoSelecionado + " tem " + inimigoSelecionado.getVida() + " de vida");

            System.out.println("O " + inimigoSelecionado + " ataca com " + inimigoSelecionado.atacar() + " de dano");
            personagemSelecionado.setVida(personagemSelecionado.getVida() - inimigoSelecionado.atacar());
            System.out.println("O " + personagemSelecionado + " tem " + personagemSelecionado.getVida() + " de vida");

            if (inimigoSelecionado.getVida() < 1) {
                System.out.println("O " + inimigoSelecionado + " morreu");
            }

            if (personagemSelecionado.getVida() < 1) {
                System.out.println("O " + personagemSelecionado + " morreu");
            }
        }

    }

}
