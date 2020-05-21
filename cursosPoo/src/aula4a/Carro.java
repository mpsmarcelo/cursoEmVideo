package aula4a;

public class Carro {

    private String cor;
    private int ano;



    public Carro(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
