package aula5a;

public class ServicoContaBancaria {

    private double saldo;
    private double saldoAnterior;


    public void criarConta(ContaBancaria contaBancaria) {

        if (contaBancaria.getTipoConta().equals(TipoConta.CORRENTE)) {
            contaBancaria.setSaldo(150.00);
        } else {
            contaBancaria.setSaldo(250.00);
        }
    }


    public void depositar(ContaBancaria contaBancaria, double valor) {
        saldoAnterior = contaBancaria.getSaldo();
        saldo = saldoAnterior + valor;
        contaBancaria.setSaldo(saldo);
        System.out.println("Deposito efetuado com sucesso, valor depositado foi de :"
                + valor
                + " saldo anterior era de : "
                + saldoAnterior
                + ", saldo atual e  de : "
                + contaBancaria.getSaldo());
    }

    public void sacar(ContaBancaria contaBancaria, double valor) {
        if (!isExisteSaldoConta(contaBancaria, valor)) {
            System.out.println("Saldo em conta insuficiente, saldo atual e de : "
                    + contaBancaria.getSaldo()
                    + ", usúario tentando sacar valor : " + valor);
            return;
        } else {

            saldo = contaBancaria.getSaldo();

            if (saldo > 0 && saldo > valor) {
                saldoAnterior = contaBancaria.getSaldo();
                saldo -= valor;
                contaBancaria.setSaldo(saldo);
                System.out.println("Saque efetuado com sucesso, valor sacado foi de : "
                        + valor
                        + ", saldo anterior era de : "
                        + saldoAnterior
                        + ", saldo em conta atualizado e de : "
                        + contaBancaria.getSaldo());

            } else {
                System.out.println("Não foi possível sacar o valor de : "
                        + valor
                        + ", saldo insuficiente, saldo em conta  e de : "
                        + contaBancaria.getSaldo());
            }
        }

    }

    public void fecharConta(ContaBancaria contaBancaria) {
        saldo = contaBancaria.getSaldo();
        if (saldo > 0) {
            System.out.println("Conta bancaria possue saldo, não e permitido fechar conta, saldo atual e de : " + saldo );
        } else {
            System.out.println("Conta foi encerrada com sucesso!");
        }
    }

    public void pagarMensalidade(ContaBancaria contaBancaria, double valor){
        saldo = contaBancaria.getSaldo();

        
    }

    public void imprimirSaldo(ContaBancaria contaBancaria) {

        System.out.println("Saldo em conta "
                + contaBancaria.getTipoConta()
                + " , de numero " + contaBancaria.getNumeroConta()
                + " , titular " + contaBancaria.getNomePessoa()
                + " , valor de " + contaBancaria.getSaldo());

    }

    public boolean isExisteSaldoConta(ContaBancaria contaBancaria, double valor) {
        double saldo = contaBancaria.getSaldo();
        return saldo > valor;

    }

}
