package calculadora;

public class Calculadora {

    public int r = 0;

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

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisao por zero, operacao irregular");
            return 0;
        }
    }
}