public class Main {
    public static void main (String[] args) {
        Calculadora minhaCalculadora = new Calculadora();

        int resultSoma = minhaCalculadora.somar(1,2);
        System.out.println("A soma dos dois números é: " + resultSoma);

        int resultSubtrair = minhaCalculadora.subtrair(1,2);
        System.out.println("A subtração do num1 pelo num2 é: " + resultSubtrair);

        int resultMultiplicar = minhaCalculadora.multiplicar(1,2);
        System.out.println("A multiplicação dos dois números é: " + resultMultiplicar);

        double resultDividir = minhaCalculadora.dividir(1,2);
        System.out.println("A divisão do num1 pelo num2 é: " + resultDividir);

    }

}