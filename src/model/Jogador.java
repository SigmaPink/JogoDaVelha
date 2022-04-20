/*
 * Jogador.java
 *
 * Created on 17 de Agosto de 2006, 09:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author newen
 */
public class Jogador {
    
    // file atributes
    char simbolo; // contem o simbolo do jogador
    int vitorias; // contem o numero de vitorias do jogador
    
    
    /** Creates a new instance of Jogador */
    public Jogador(char simbolo) {
        // recebe o simbolo para o jogador
        this.simbolo = simbolo;
    }
    
    /** Incrementar em uma unidade o numero de vitorias do jogador */
    public void incrementaVitorias() {
        this.vitorias++;
    }
    
    /** Zerar o numero de vitorias do jogador */
    public void zerarVitorias() {
        this.vitorias = 0;
    }
    
    /** Retornar o simbolo do jogador */
    public char getSimbolo() {
        return simbolo;
    }
    
    /** Retornar o numero de vitorias do jogador */
    public int getVitorias() {
        return this.vitorias;
    }
    
    
    
}
