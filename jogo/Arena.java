package jogo;

import java.util.ArrayList;
import java.util.Random;

public class Arena {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(new Personagem("Carlos", 10, 2));
        personagens.add(new Personagem("Augusto", 10, 2));
        personagens.add(new Personagem("Zhou", 10, 2));

        ArrayList<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Inimigo("Jorge", 10, 1));
        inimigos.add(new Inimigo("Pedro", 10, 1));
        inimigos.add(new Inimigo("Luiz", 10, 1));

        //Randomizar um presonagem e um inimigo

        Random randomInimigo = new Random();
        Inimigo inimigoSelecionado = inimigos.get(randomInimigo.nextInt(inimigos.size()));

        Random randomPersonagem = new Random();
        Personagem personagemSelecionado = personagens.get(randomPersonagem.nextInt(personagens.size()));


        Batalha b = new Batalha(personagemSelecionado,inimigoSelecionado);
        b.iniciarBatalha();

       /* while (esqueleto.getVida() > 1 && principal.getVida() > 1) {

            System.out.println("O personagem ataca com " + principal.atacar() + " de dano");
            esqueleto.setVida(esqueleto.getVida() - principal.atacar());
            System.out.println("O esqueleto tem " + esqueleto.getVida() + " de vida");

            System.out.println("O esqueleto ataca com " + esqueleto.atacar() + " de dano");
            principal.setVida(principal.getVida() - esqueleto.atacar());
            System.out.println("O personagem tem " + principal.getVida() + " de vida");

            if (esqueleto.getVida() < 1) {
                System.out.println("O esqueleto morreu");
            }

            if (principal.getVida() < 1) {
                System.out.println("O personagem morreu");
            }
        }
        */
    }
}

