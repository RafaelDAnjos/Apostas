/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aposta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        Usuario usuario = new Usuario();
        usuario.nome = "Rafael";
        ArrayList<Aposta>listaAposta = new ArrayList();
        Time cruzeiro = new Time();
        cruzeiro.nomeTime = "Cruzeiro";
        Time flamengo = new Time();
        flamengo.nomeTime = "Flamengo";
        Time vasco = new Time();
        vasco.nomeTime= "Vasco";
        Time ipatinga = new Time();
        ipatinga.nomeTime = "Ipatinga";
        
        Aposta aposta1 = new Aposta(flamengo,vasco);
        listaAposta.add(aposta1);
        Aposta aposta2 = new Aposta(cruzeiro,ipatinga);
        listaAposta.add(aposta2);
        while( cont <listaAposta.size()){
          
          String resposta = JOptionPane.showInputDialog("Aposta1: "+listaAposta.get(cont).timeA.nomeTime+" X "+listaAposta.get(cont).timeB.nomeTime+" Deseja Apostar? S/N");
          if(resposta.equals("S")){
              usuario.Apostar(listaAposta.get(cont));
              
          }
          cont++;
        }
        
        
    }
    
}
