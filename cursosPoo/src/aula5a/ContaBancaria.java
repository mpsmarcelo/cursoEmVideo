package aula5a;

public class ContaBancaria {

    private String      nomePessoa;
    private TipoConta   tipoConta;
    private String      numeroConta;
    private StatusConta status;
    private double      saldo;



    public ContaBancaria(String nomePessoa,TipoConta tipoConta, StatusConta status, String numeroConta) {
        this.tipoConta = tipoConta;
        this.status = status;
        this.numeroConta = numeroConta;
        this.nomePessoa = nomePessoa;
    }


    public void setStatus(StatusConta status) {
        this.status = status;
    }


    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public StatusConta getStatus() {

        return status;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
}
