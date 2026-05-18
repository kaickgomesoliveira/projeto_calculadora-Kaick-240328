package calculadora;

/**
 * Classe utilizada para realizar verificacoes basicas da classe Calculadora.
 * 
 * Este programa executa diferentes operacoes matematicas para conferir
 * o funcionamento dos metodos de soma, subtracao, multiplicacao e divisao,
 * incluindo tambem casos de erro, como divisao por zero e operador invalido.
 * 
 * @author Kaick
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Metodo de entrada do programa, onde os testes da calculadora sao chamados.
     * 
     * @param args parametros recebidos pela linha de comando
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Teste de soma:");
        calc.calc(2, 3, "+"); // resultado esperado: 5

        System.out.println("Teste de subtracao:");
        calc.calc(10, 4, "-"); // resultado esperado: 6

        System.out.println("Teste de multiplicacao:");
        calc.calc(3, 5, "*"); // resultado esperado: 15

        System.out.println("Teste de divisao:");
        calc.calc(8, 2, "/"); // resultado esperado: 4

        System.out.println("Teste de divisao por zero:");
        calc.calc(10, 0, "/"); // deve exibir mensagem de erro

        System.out.println("Teste de operacao invalida:");
        calc.calc(5, 5, "%"); // deve indicar operacao invalida
    }
}
