package aula1a;

import java.awt.*;

public class PrincipalTv {

    public static void main(String[] args) {

        ServicoImpressao  servicoImpressao = new ServicoImpressao();
        List impressao = new List();

        Televisor tv = new Televisor("Samsung","Preta","2 m²",2.000);
        Sofa sofa = new Sofa("Cinza","2.00","4mt");
        Pessoa pessoa = new Pessoa("Marcelo");

        Televisor tv1 = new Televisor("Lg","Prata","3 m²",5.000);
        Sofa sofa1 = new Sofa("Preta","5.00","6mt");
        Pessoa pessoa1 = new Pessoa("Paulo");

        servicoImpressao.imprimir(pessoa,tv,sofa);
        servicoImpressao.imprimir(pessoa1,tv1,sofa1);

//      impressao.add(servicoImpressao.imprimir(pessoa1,tv1,sofa1));
    }

}
