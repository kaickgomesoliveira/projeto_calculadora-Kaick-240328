package calculadora;

/**
 * Classe responsavel por realizar operacoes matematicas basicas.
 * 
 * A classe Calculadora possui metodos para soma, subtracao,
 * multiplicacao e divisao, alem de tratar erros como divisao por zero
 * e operacoes invalidas.
 * 
 * @author Kaick
 * @version 1.0
 */
public class Calculadora {

    /**
     * Atributo que armazena o resultado da operacao realizada.
     */
    public int r = 0;

    /**
     * Metodo principal da calculadora.
     * 
     * Recebe dois numeros inteiros e uma operacao matematica, executando
     * o calculo correspondente.
     * 
     * @param a primeiro numero da operacao
     * @param b segundo numero da operacao
     * @param op operador matematico informado pelo usuario
     * @return resultado da operacao realizada
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
     * Realiza a soma entre dois numeros inteiros.
     * 
     * @param a primeiro numero
     * @param b segundo numero
     * @return resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtracao entre dois numeros inteiros.
     * 
     * @param a primeiro numero
     * @param b segundo numero
     * @return resultado da subtracao
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicacao entre dois numeros inteiros.
     * 
     * @param a primeiro numero
     * @param b segundo numero
     * @return resultado da multiplicacao
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisao entre dois numeros inteiros.
     * 
     * Caso o divisor seja zero, o metodo apresenta uma mensagem de erro
     * e retorna zero, evitando falhas na execucao do programa.
     * 
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisao ou zero em caso de divisao por zero
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