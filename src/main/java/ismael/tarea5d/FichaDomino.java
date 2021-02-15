/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.Random;

/**
 *
 * @author ismael
 */
public class FichaDomino {

    private int valor1;
    private int valor2;

    public FichaDomino(int valor1, int valor2) {
        if (valor1 > 6 || valor1 < 0) {
            if (valor1 % 2 == 0) {
                System.out.println("Se ha añadido un valor no soportado al ser par se sustituira por un 6");
                this.valor1 = 6;
            } else {
                System.out.println("Se ha añadido un valor no soportado al ser impar se sustituira por un 5");
                this.valor1 = 5;
            }
        }else {
            this.valor1 = valor1;
            this.valor2 = valor2;
        }
        if (valor2 > 6 || valor2 < 0) {
            if (valor2 % 2 == 0) {
                System.out.println("Se ha añadido un valor no soportado al ser par se sustituira por un 6");
                this.valor2 = 6;
            } else {//comprueba que los valores no esten fuera de rango
                System.out.println("Se ha añadido un valor no soportado al ser impar se sustituira por un 5");
                this.valor2 = 5;
            }
        }else {
            this.valor1 = valor1;
            this.valor2 = valor2;
        }

    }

    public FichaDomino() {
        this.valor1 = 0;
        this.valor2 = 0;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor1(byte valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(byte valor2) {
        this.valor2 = valor2;
    }

    @Override
    public String toString() {//si tiene un valor en 0 lo representa coomo blanco
        String toString;
        if (valor1 == 0) {
            toString = "[ |" + valor2 + ']';
        } else if (valor2 == 0) {
            toString = "[" + valor1 + "| ]";
        }else {
        toString="["+valor1+"|"+valor2+"]";
        }
        return toString;
    }

    public byte getValorTotal() {
        byte valorTotal;
        valorTotal = (byte) (this.valor1 + this.valor2);//suma en byte los dos valores
        return valorTotal;
    }

    public FichaDomino generaFichaAleatoria() {
        Random rnd = new Random();
        int numero1, numero2;
        numero1 = rnd.nextInt(7);
        numero2 = rnd.nextInt(7);//genera numeros aleatorios

        FichaDomino ficha = new FichaDomino(numero1, numero2);

        return ficha;
    }

}
