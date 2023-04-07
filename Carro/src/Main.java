//Exercício 1: Classe Carro
//Crie uma classe chamada "Carro" com os seguintes atributos públicos:
//marca, modelo, ano e cor. Em seguida, crie um método chamado "acelerar"
//que imprima a mensagem "Acelerando o carro!". Crie também um método
//chamado "frear" que imprima a mensagem "Freando o carro!".
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.marca = "Jeep";
        meuCarro.modelo = "Compass";
        meuCarro.ano = 2021;
        meuCarro.cor = "Branco";
        meuCarro.acelerar();
        meuCarro.frear();

        System.out.println("Meu Carro é um " + meuCarro.marca + " " + meuCarro.modelo + " " + meuCarro.ano + " " + meuCarro.cor + ".");
    }
}
