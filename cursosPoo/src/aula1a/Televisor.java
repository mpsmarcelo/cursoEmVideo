package aula1a;

public class Televisor {


    String marca;
    String cor;
    String tamanho;
    double valor;

    public Televisor(){

    }

    public Televisor(String marca,String cor,String tamanho,double valor){
        this.marca = marca;
        this.cor = cor;
        this.tamanho =  tamanho;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirTv(){
        System.out.println("Caracteristicas Tv, Cor: " + getCor() + ", tamanho: " + getTamanho() + ", valor: "
                + getValor() + ", marca: " + getMarca());

    }



}
