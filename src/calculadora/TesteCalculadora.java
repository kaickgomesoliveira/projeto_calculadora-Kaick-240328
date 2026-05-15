package calculadora;

/**
 * Classe responsavel por executar testes simples da classe Calculadora.
 * 
 * Os testes verificam as operacoes basicas da calculadora, incluindo
 * soma, subtracao, multiplicacao, divisao, divisao por zero e operacao invalida.
 * 
 * @author Kaick
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Metodo principal responsavel por executar os testes da calculadora.
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Teste de soma:");
        calc.calc(2, 3, "+"); // esperado 5

        System.out.println("Teste de subtracao:");
        calc.calc(10, 4, "-"); // esperado 6

        System.out.println("Teste de multiplicacao:");
        calc.calc(3, 5, "*"); // esperado 15

        System.out.println("Teste de divisao:");
        calc.calc(8, 2, "/"); // esperado 4

        System.out.println("Teste de divisao por zero:");
        calc.calc(10, 0, "/"); // erro esperado

        System.out.println("Teste de operacao invalida:");
        calc.calc(5, 5, "%"); // operacao invalida esperada
    }
}