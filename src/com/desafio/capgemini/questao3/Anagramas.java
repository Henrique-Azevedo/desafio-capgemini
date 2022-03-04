package com.desafio.capgemini.questao3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Anagramas {


        public static final int ALPHABET_CNT = 26;

        static boolean isAnagrams (String s1, String s2){

        char[] chCnt1 = new char[ALPHABET_CNT];
        char[] chCnt2 = new char[ALPHABET_CNT];


        for (int i = 0, n = s1.length(); i < n; i++) {

            chCnt1[s1.charAt(i) - 97] += 1;
            chCnt2[s2.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < ALPHABET_CNT; i++) {
            if (chCnt1[i] != chCnt2[i]) {
                return false;
            }
        }

        return true;
    }

        static int verificaAnagramas (String s){
        int cnt = 0;
        for (int i = 1, n = s.length(); i < n; i++) {
            List<String> subsetList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i + j <= n) {
                    subsetList.add(s.substring(j, i + j));
                }
            }

            for (int k = 0, size = subsetList.size(); k < size; k++) {
                for (int l = k + 1; l < size; l++) {
                    if (isAnagrams(subsetList.get(k), subsetList.get(l))) {
                        cnt++;
                    }
                }
            }
        }


        return cnt;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static boolean matchesOnlyText(String text) {

        return text.matches("[^\\d]+");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Digite uma palavra e veja quantos pares de anagramas podem ser formado:");
            String s = scanner.nextLine();

                int result = verificaAnagramas(s);

                System.out.println(result);

                scanner.close();

       }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("ATENÇÃO! \nPara a verificação dos anagramas voce deve digitar " +
                                          "apenas letras");
        }
    }
}