package aula1a;

public class Pessoa {

    String nome;

    public Pessoa(){

    }
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirPessoa(){
        System.out.println("Nome pessoa : " + getNome());
    }
}
