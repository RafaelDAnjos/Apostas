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
public class Aposta {
 
    int qtdGolA;
    int qtdGolB;
    int premio;
    Time timeA;
    Time timeB;
    public Aposta(Time time1,Time time2){
        timeA = time1;
        timeB = time2;
        
        
    }
    public void Palpite(){
           String Gol;
        Gol = JOptionPane.showInputDialog("Gols para"+timeA.nomeTime);
        qtdGolA = Integer.parseInt(Gol);
        Gol = JOptionPane.showInputDialog("Gols para"+timeB.nomeTime);
        qtdGolB = Integer.parseInt(Gol);
        premio++;

    }
}
