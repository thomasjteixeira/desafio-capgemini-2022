package com.github.thomasjteixeira;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Olá! Sou o Thómas Jéfferson");
        System.out.println("Bem vindo ao DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI 2020!\n");
        System.out.println("Nesse desafio foi desenvolvido 3 questões solicitadas!");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Digite a questão que deseja acessar (1 à 3) ou -1 para sair");
        System.out.println("----------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while(input != -1){

            if(input == 1){
                System.out.println("----------------------------------------------------------------");
                System.out.println("Q1 Árvore de Natal - Digite um número do tamanho da arvore ou -1 para sair");
                System.out.println("----------------------------------------------------------------");
                int n = scanner.nextInt();

                if(n == -1) break;

                String christmasTree = Q1ChristmasTree.printTree(n);
                System.out.println(christmasTree);

            }else if(input == 2){
                System.out.println("----------------------------------------------------------------");
                System.out.println("Q2 Password - Digite um senha ou -1 para sair");
                System.out.println("----------------------------------------------------------------");
                String password = scanner.nextLine();

                if(password.equals("-1")) break;

                int passwordStrong = Q2Password.minimumCharForPasswordToBeStrong(password);
                System.out.println(passwordStrong);
            }else if(input == 3){
                System.out.println("----------------------------------------------------------------");
                System.out.println("Q3 Anagramas - Digite um anagrama ou -1 para sair");
                System.out.println("----------------------------------------------------------------");
                String anagrama = scanner.nextLine();

                if(anagrama.equals("-1")) break;

                int anagrams = Q3Anagrams.numberOfAnagramsInAString(anagrama);
                System.out.println(anagrams);

            }else{
                System.out.println("----------------------------------------------------------------");
                System.out.println("Digite um questão de 1 à 3 ou -1 para sair");
                System.out.println("----------------------------------------------------------------");
                input = scanner.nextInt();
                continue;
            }
        }
    }
}
