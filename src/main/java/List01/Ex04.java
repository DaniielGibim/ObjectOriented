package List01;

import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada saida
    10       6
    2
    5
 */
public class Ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos dinheiros você tem : ");
        int n = scanner.nextInt();
        System.out.println("Digite quanto custa cada chocolate: ");
        int c = scanner.nextInt();
        System.out.println("Digeite quantas embalagens são necessárias para ganhar um chocolate: ");
        int m = scanner.nextInt();
        Ex04 ex04 = new Ex04();
        System.out.println(ex04.compute( n,c,m));
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    int compute(int dinheiro, int precoChocolate, int embalagensParaChocolateGratis) {


        int chocolatesComprados = dinheiro / precoChocolate;
        int embalagensDevolvidas = chocolatesComprados;

        while (embalagensDevolvidas >= embalagensParaChocolateGratis) {
            int chocolatesGratis = embalagensDevolvidas / embalagensParaChocolateGratis;
            chocolatesComprados += chocolatesGratis;
            embalagensDevolvidas = embalagensDevolvidas % embalagensParaChocolateGratis + chocolatesGratis;
        }
        return chocolatesComprados;
    }
}