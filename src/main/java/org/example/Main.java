package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();

        if(numero <= 1){
            System.out.println(numero + "Não é um número primo");
        }else{
            boolean numeroPrimo = false;
                              // Math.sqrt() Nos retorna a raiz quadrada do valor
            for(int i = 2; i <= Math.sqrt(numero); i++){
                if(numero % i != 0){
                    numeroPrimo = true;
                }else{
                    numeroPrimo = false;
                }
            }
            if(numeroPrimo == true){
                System.out.println("O numero " + numero + " é Primo");
            }else{
                System.out.println("O numero " + numero + " não é primo");
            }
        }
        scanner.close();
    }
}