/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aposta;

import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Usuario {
    String nome;
    String email;
    String senha;
    int qtdCoin;
    ArrayList<Aposta>listaApostas = new ArrayList();
    public void Apostar(Aposta aposta){
        aposta.Palpite();
        listaApostas.add(aposta);
        qtdCoin--;
    
    }
}
