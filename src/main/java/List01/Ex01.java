package List01;
/*
    Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

    Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    Critério B: R$ 0,50 por livro + R$ 2,50 fixo
    Faça um programa em que o usuário informe a quantidade positiva e não nula de livros,
    seja impressa qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de livros: ");
        final int input = scanner.nextInt();
        final Ex01 ex01 = new Ex01();

        System.out.println(ex01.compute(input));
    }
        String compute(int qtdLivros) {

            if (qtdLivros <= 0) return "Erro";

            final double precoA = 0.25 * qtdLivros + 7.50;
            final double precoB = 0.50 * qtdLivros + 2.50;

            if (precoA < precoB) return "Criterio A";
            if (precoA == precoB) return "Indiferente";

            return "Criterio B";
        }

}


