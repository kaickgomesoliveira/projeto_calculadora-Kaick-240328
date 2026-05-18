package calculadora;

/**
 * Classe criada para executar calculos matematicos simples.
 * 
 * A classe Calculadora disponibiliza funcionalidades para soma, subtracao,
 * multiplicacao e divisao. Tambem possui tratamento para situacoes como
 * divisao por zero e operadores nao reconhecidos.
 * 
 * @author Kaick
 * @version 1.0
 */
public class Calculadora {

    /**
     * Variavel utilizada para guardar o valor obtido apos o calculo.
     */
    public int r = 0;

    /**
     * Metodo responsavel por selecionar e executar a operacao desejada.
     * 
     * A partir de dois valores inteiros e de um operador recebido como texto,
     * o metodo identifica qual calculo deve ser realizado e armazena o
     * resultado na variavel r.
     * 
     * @param a primeiro valor utilizado no calculo
     * @param b segundo valor utilizado no calculo
     * @param op simbolo da operacao matematica escolhida
     * @return valor final obtido pela operacao
     */
    public int calc(int a, int b, String op) {
        switch (op) {
            case "+":
                r = somar(a, b);
                break;
            case "-":
                r = subtrair(a, b);
                break;
            case "*":
                r = multiplicar(a, b);
                break;
            case "/":
                r = dividir(a, b);
                break;
            default:
                System.out.println("Operacao invalida");
                r = 0;
        }

        System.out.println("Resultado = " + r);
        return r;
    }

    /**
     * Calcula a adicao de dois numeros inteiros.
     * 
     * @param a primeiro valor da soma
     * @param b segundo valor da soma
     * @return soma dos dois valores
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Calcula a diferenca entre dois numeros inteiros.
     * 
     * @param a valor inicial da subtracao
     * @param b valor a ser subtraido
     * @return diferenca entre os valores informados
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Calcula o produto entre dois numeros inteiros.
     * 
     * @param a primeiro fator da multiplicacao
     * @param b segundo fator da multiplicacao
     * @return produto dos dois fatores
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Calcula a divisao entre dois numeros inteiros.
     * 
     * Quando o divisor informado for igual a zero, o metodo exibe uma mensagem
     * de erro e retorna o valor zero como resultado da operacao.
     * 
     * @param a valor que sera dividido
     * @param b valor usado como divisor
     * @return quociente da divisao ou zero caso o divisor seja zero
     */
    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisao por zero, operacao irregular");
            return 0;
        }
    }
}
