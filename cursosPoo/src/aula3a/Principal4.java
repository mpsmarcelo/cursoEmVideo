package aula3a;

public class Principal4 {

    public static void main(String[] args) {

        Cadeira cadeira = new Cadeira();

        cadeira.cor  = "Preta";
        cadeira.qtd_pernas = 4;
//        cadeira.valor = 45.00  Não pode acessar pois na Classe Cadeira o atributo esta definido como Private.

        cadeira.setValor(4.00);  //acessando a variavel atraves do metodo set, qual esta definido como public dentro da classe, sendo este possui acesso
                                // a variavél internamente. Pois atributos private podem ser acessados dentro da propria classe.



    }
}
