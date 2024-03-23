package List01;

import java.util.Scanner;

/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/
public class Ex05 {

    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite de velocidade da via: ");
        int L = scanner.nextInt();
        System.out.println("Digite o valor da multa ");
        double m = scanner.nextDouble();
        System.out.println("Digite o valor adicional para cada KM acima da velocidade: ");
        double a = scanner.nextDouble();
        System.out.println("Digite a velocidade do motorista: ");
        int v = scanner.nextInt();

        Ex05 ex05 = new Ex05();
        System.out.println(ex05.compute(L, m, a, v));
    }
    double compute(int limite, double multa, double adicional, int velocidade) {

        if (velocidade <= limite) {
            return 0;
        } else {
            multa = multa + ((velocidade - limite) * adicional);
            return Math.round(multa * 100.0) / 100.0;
        }

    }


}
