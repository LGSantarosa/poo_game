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
    }
}

