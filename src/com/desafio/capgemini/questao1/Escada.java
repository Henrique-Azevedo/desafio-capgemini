package com.desafio.capgemini.questao1;

import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {

        int n;
        int z;
        int x;
        System.out.println("Digite o número de degraus: ");

        try{

            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            z = n;
            x = 0;

            while (n > x){

                for(int i = 1; i < n; i++){
                    System.out.print(" ");
                }

                for(int i = n - 1; i < z; i++){
                    System.out.print("*");
                }

                System.out.print("\n");

                n = n - 1;
            }
        }catch (java.util.InputMismatchException exception){
            System.out.println("ATENÇÃO! \nDigite apenas números inteiros.");
        }

    }
}