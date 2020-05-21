package aula1a;

public class Sofa {

    String cor;
    String tamanho;
    String altura;

    public Sofa(){}

    public Sofa(String cor, String tamanho, String altura){
        this.cor = cor;
        this.tamanho = tamanho;
        this.altura = altura;
    }

    public void imprimirSofa() {
        System.out.println("Caracteristicas Sofá: cor: " + getCor() + ", altura: " + getAltura() + ", tamanho: " + getTamanho());
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }


}
