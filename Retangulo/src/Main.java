public class Main {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();

        int resultArea = meuRetangulo.area(7, 3);
        System.out.println("A área do retângulo é: " + resultArea);
        double resultPerimetro = meuRetangulo.perimetro(1,2);
        System.out.println("O perímetro do retângulo é: " + resultPerimetro);


    }
}