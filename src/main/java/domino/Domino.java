/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ismael
 */
public class Domino {

    private Set<FichaDomino> domino = new HashSet<>();

    public String numeroDeFichas() {

        return "Hay creadas " + domino.size() + "fichas de domino";
    }

    public Set<FichaDomino> getDomino() {
        return domino;
    }

    public void setDomino(Set<FichaDomino> domino) {
        this.domino = domino;
    }

    
    public String introducirFicha(int a, int b) {
        if (domino.add(new FichaDomino(a, b))){
         return "Se ha introducido correctamente la ficha ";
        }
        else{return "La ficha ya estaba repetida intentelo de nuevo";}
    }

    public boolean tieneCosas() {
        return !domino.isEmpty();
    }

    public ArrayList<FichaDomino> arrayList() {
        ArrayList<FichaDomino> lista = new ArrayList<FichaDomino>();

        for (FichaDomino f : domino) {
            lista.add(f);
        }
        domino.clear();
        return lista;
    }

    public boolean contains(FichaDomino f) {
        return domino.contains(f);
    }

    public String eliminarFicha(FichaDomino f) {
        if (contains(f)) {
            domino.remove(f);
            return ("Se ha eliminado la dicha correcta");
        } else {
            return "No se ha encontrado la ficha";
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int a, b;
        Domino a1 = new Domino();
        for (int i = 0; i <= 25; i++) {
            a = rnd.nextInt(7);
            b = rnd.nextInt(7);
            a1.domino.add(new FichaDomino(a, b));
        }
        System.out.println(a1.introducirFicha(5, 5));
        System.out.println(a1.numeroDeFichas());
        a1.contains(new FichaDomino(5, 5));
        a1.eliminarFicha(new FichaDomino(5, 5));
        System.out.println(a1.arrayList());
        System.out.println(a1.tieneCosas());
        
    }
}
