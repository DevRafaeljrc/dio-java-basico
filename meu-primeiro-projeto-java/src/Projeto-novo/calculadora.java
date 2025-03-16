public class calculadora {
    int soma(int a, int b) {
        return a + b;
    }

    int subtracao(int a, int b) {
        return a - b;
    }

    int multiplicacao(int a, int b) {
        return a * b;
    }

    int divisao(int a, int b) {
        return a / b;
    }

    int resto(int a, int b) {
        return a % b;
    }

    int potencia(int a, int b) {
        return (int) Math.pow(a, b);
    }

    int raizQuadrada(int a) {
        return (int) Math.sqrt(a);
    }

    public void main(String[] args) {
        calculadora calc = new calculadora();
        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtração: " + calc.subtracao(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicacao(10, 5));
        System.out.println("Divisão: " + calc.divisao(10, 5));
        System.out.println("Resto: " + calc.resto(10, 5));
        System.out.println("Potência: " + calc.potencia(10, 5));
        System.out.println("Raiz Quadrada: " + calc.raizQuadrada(10));
    }



}

