import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe valor A");
        int valorA= sc.nextInt();
        System.out.println("informe valor B");
        int valorB = sc.nextInt();

        int soma = valorA + valorB;
        int subtracao = valorA - valorB;
        int multiplicacao = valorA * valorB;
        int divisao = valorA / valorB;

        int somaViaFuncao = soma(valorA, valorB );
        System.out.println("valor soma " + somaViaFuncao);

        int subtrairComFuncao = subtracao(valorA, valorB);
        System.out.println("valor subtracao " + subtrairComFuncao);

        int multiplicarComFuncao = multiplicacao(valorA,valorB);
        System.out.println("valor multiplicacao " + multiplicarComFuncao);

        int divisaoComFuncao = divisao(valorA, valorB);
        System.out.println("valor divisao " + divisaoComFuncao);
    }


    public static int soma(int valorA, int valorB) {
        return valorA + valorB;
    }

    public static int subtracao(int valorA, int valorB) {
        if (valorA < 0) {
            valorA = valorA * -1;
        }
        return valorA - valorB;
    }

    public static int multiplicacao(int valorA, int valorB) {
        if (valorA < 0) {
            valorA = valorA * -1;
        }

        return valorA * valorB;
    }
    public static int divisao(int valorA, int valorB){
        if (valorA < 0) {
            valorA = valorA * -1;
        }
        return valorA / valorB;
    }

}


