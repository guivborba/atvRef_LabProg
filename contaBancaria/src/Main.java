/*Crie uma classe chamada "ContaBancaria"
com os seguintes atributos públicos: numeroDaConta,
saldo e titular. Crie métodos públicos para depositar,
sacar e transferir dinheiro. Lembre-se de verificar
se há saldo suficiente para realizar saques e transferências.*/
public class Main {
    public static void main(String[] args) {
        contaBancaria contaBancaria1 = new contaBancaria();

        int numConta = contaBancaria1.numeroDaConta = 9283;
        System.out.println("Número da conta: " + numConta);

        String nomeTitular = contaBancaria1.titular = "João Pedro";
        System.out.println("O nome do titular é: " + nomeTitular);

        float saldoConta =  contaBancaria1.saldo = 20;
        System.out.println("O saldo da conta " + numConta + " é: R$" + saldoConta);

        float deposito = contaBancaria1.depositar(2);
        System.out.println("Você depositou: R$" + deposito);
        System.out.println("Seu saldo atual é: R$" + (deposito+saldoConta));

        float saque = contaBancaria1.sacar(23);
        if (saque <= saldoConta) {
            System.out.println("Você sacou: R$" + saque);
            System.out.println("Seu saldo atual é: R$" + (saldoConta - saque + deposito));
        }
        else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }


        float transferencia = contaBancaria1.transferir(30);
        if (transferencia <= saldoConta) {
            System.out.println("Você transferiu: R$" + transferencia);
            System.out.println("Seu saldo é: R$" + (saldoConta + deposito - saque - transferencia));
        }else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        }

}