package List01;


import java.util.Scanner;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura da parede: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o custo da lata: ");
        double custo = scanner.nextDouble();
        System.out.println("Digite o rendimento da lata: ");
        double metros = scanner.nextDouble();

        Ex06 ex06 = new Ex06();



        System.out.println(ex06.compute(largura,altura,custo,metros));

    }

    String compute(double largura, double altura, double custo, double metros) {

        double area = largura * altura;
        int qtddLatas = (int) Math.ceil(area / metros);
        double custoTotal = qtddLatas * custo;

        return String.format("%d %.2f", qtddLatas, custoTotal);

    }

}