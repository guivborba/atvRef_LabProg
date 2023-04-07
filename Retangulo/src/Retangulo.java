/*Crie uma classe chamada "Retângulo" com dois atributos públicos:
base e altura. Crie um método chamado "calcularArea" que retorne
a área do retângulo. Crie outro método chamado "calcularPerimetro" que retorne o perímetro do retângulo.*/
public class Retangulo {
    int area (int base, int altura){
        return base * altura;
    }
    double perimetro (double base, double altura){
        return (Math.pow(base, base)) + (Math.pow(altura, altura));
    }
}
