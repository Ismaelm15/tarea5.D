/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea5d;

import domino.FichaDomino;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ismael
 */
public class Domino {
     private Set<FichaDomino> domino = new HashSet<>();

      public String numeroDeFichas(){
      
      return "Hay creadas "+domino.size()+"fichas de domino";
      }
      
      public void introducirFicha(int a , int b){
      domino.add(new FichaDomino(a,b));
      }
      
      
      public static void main(String[] args) {
        Random rnd=new Random();
        int a,b;
        Domino a1= new Domino();
        for (int i=0;i<=25;i++){
        a=rnd.nextInt(7);
        b=rnd.nextInt(7);
        a1.domino.add(new FichaDomino(a,b));
        
    }}
}
