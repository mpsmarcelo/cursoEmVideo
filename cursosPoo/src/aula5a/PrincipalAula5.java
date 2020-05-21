package aula5a;

public class PrincipalAula5 {

    public static void main(String[] args) {


        ServicoContaBancaria servicoContaBancaria = new ServicoContaBancaria();
        ContaBancaria contaBancaria = new ContaBancaria("Marcelo Pereira",TipoConta.POUPANCA, StatusConta.ABERTURA,"55.6626-5");
        servicoContaBancaria.criarConta(contaBancaria);
        servicoContaBancaria.imprimirSaldo(contaBancaria);
        System.out.println("1º Saque");
        servicoContaBancaria.sacar(contaBancaria,300.00);
        System.out.println("2º saque");
        servicoContaBancaria.sacar(contaBancaria,100.00);
        servicoContaBancaria.depositar(contaBancaria,300.00);

    }
}
