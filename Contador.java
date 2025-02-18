import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {

        /**
         * O sistema deverá receber 2 números inteiros via terminal
         * através destes números obter a quantidade de interações e
         * realizar  a impressão no console dos números incrementados.
         * Caso o 1º termo seja maior que o segundo, lanãr excessão com
         * a msg "O segundo parâmetro deve ser maior que o primeiro."
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro.");
        int parameto1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro.");
        int parameto2 = sc.nextInt();

        try {
            contar(parameto1, parameto2);
        } catch (Exception e){
            System.out.println("O segundo número tem que ser maior que o primeiro.");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosExceptions {

        int interacoes = 0 ;
        if (parametro2 > parametro1) {
            interacoes = parametro2 - parametro1;
        }
        else{
            throw new ParametrosInvalidosExceptions();
        }
        System.out.println("Quantidade de interações a serem feitas: " + interacoes);
        for (int i = 0;  i <= interacoes ; i++){
            System.out.println(parametro1 + i);
        }
    }
}
