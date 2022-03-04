package com.desafio.capgemini.questao2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SenhaForte {

        public static void main(String[] args) {
            System.out.println("Crie a sua senha: ");
            Scanner s = new Scanner(System.in);
            String pass;
            pass = s.next();

            Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,})");
            Matcher m = p.matcher(pass);
            //System.out.println(m.matches());
            int size = pass.length();
            int dif = 6 - size;
            //System.out.println(size);

            if(size < 6){
                System.out.println("Para sua senha ser mais segura acrescente mais " + dif + " caracteres \ne siga as instruções abaixo:");
            }

            if(m.matches()){

                System.out.println("Senha forte! Já pode prosseguir com o seu cadastro.");

            }else {
                System.out.println("Senha fraca" +
                        "\nVoce deve criar sua senha com os seguintes critérios:" +
                        "\n* Possuir no mínimo 6 caracteres." +
                        "\n* conter no mínimo 1 dígito" +
                        "\n* Conter no mínimo 1 letra em minúsculo." +
                        "\n* Conter no mínimo 1 letra em maiúsculo." +
                        "\n* Conter no mínimo 1 caractere especial: !@#$%^&*()-+");
            }

        }

}


