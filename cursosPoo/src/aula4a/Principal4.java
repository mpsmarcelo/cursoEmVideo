package aula4a;

public class Principal4 {


    public static void main(String[] args) {

        Proprietario dono = new Proprietario("Marcelo");
        Carro carro = new Carro("Branca",2013);


        System.out.println("Dados carro: " + carro.getCor() + ", " + carro.getAno());
        System.out.println("Dados dono: " + dono.getNome());

    }
}
