/*
 * JogadorComputador.java
 *
 * Created on 31 de Agosto de 2006, 20:31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package model;

import java.util.Random;

/**
 *
 * @author newen
 */
public class JogadorComputador extends Jogador {
    
    /** Creates a new instance of JogadorComputador */
    public JogadorComputador(char simbolo) {
        super(simbolo);
    }
    
    public String fazerJogada(Tabuleiro tab){
        String lista[] = tab.getLista(true);
        int rand = getRandomico(0, lista.length-1);
        String ret = lista[rand];
        return(ret);
    }
    
    private static int getRandomico(int start, int end) {
        Random generator = new Random();
        long range = (long)end - (long)start + 1;
        long fraction = (long)(range * generator.nextDouble());
        return((int)(fraction + start));
    }
}
