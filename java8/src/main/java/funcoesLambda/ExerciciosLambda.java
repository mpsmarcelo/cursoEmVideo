package funcoesLambda;


import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosLambda {


    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
        List<String>  listaNomes =  Arrays.asList("Marcelo pereira","Marcos pereira","Sônia", "Manoel");

        //(Stream/Lambda)
        // Utilizando filtros e tratando dados em uma lista
        Long count = lista.stream()
                .limit(6)
                .filter(e -> e % 2 == 0)
                .map(e  -> e * 2 )
                .count();
        System.out.println("Quantidades : " + count);

        Optional<Integer>  min = lista.stream()
                .min(Comparator.naturalOrder());
        System.out.println("Menor inteiro da lista : " + min.get() );

        Optional<Integer> max = lista.stream()
                .max(Comparator.naturalOrder());
        System.out.println("Maior inteiro da lista : " + max.get());

        List<Integer> newListInteiro =  lista.stream()
                                        .filter(e -> e % 2 ==0)
                                        .collect(Collectors.toList());
        System.out.println("Nova lista de número inteiros, pares : " + newListInteiro);


        List<String> listaNomesContemLetraM  =  listaNomes.stream().filter(e -> e.contains("M")) .collect(Collectors.toList());

        System.out.println("Lista de nomes que contem (M) : "+ listaNomesContemLetraM);


        //Utilzando collect em  lista booleana
        Map<Boolean, List<Integer>> listaBoleana  =  lista.stream().collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println("Lista boleana de inteiros impares: " + listaBoleana.get(Boolean.FALSE));
        System.out.println("Lista boleana de inteiros pares: " + listaBoleana.get(Boolean.TRUE));

        //Utilizando collect Grouping em lista
        Map<Boolean,List<String>> listaParentes = listaNomes.stream().collect(Collectors.groupingBy(e -> e.contains("Marcelo") || e.contains("Marcos")));
        System.out.println("Lista boleana de nomes encontrados : " + listaParentes.get(Boolean.TRUE));



        //Utilizando Stream e tratando lista a partir de um metodo
        List<String> listaRegistros =  getRegistrosDaLista(listaNomes, "M",0,5);
        System.out.println("lista de registros : " + listaRegistros);



        //Utilizando joining em lista
        String listaJoining = lista.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(";"));
        System.out.println("Lista joining :" + listaJoining);

    }

    public static List<String> getRegistrosDaLista(List<String> lista, String filtro, Integer posicaoInicial, Integer posicaoFinal) {
        return lista.stream()
                .skip(getPosicaoLista(posicaoInicial))
                .limit(getPosicaoLista(posicaoFinal))
                .filter(e -> e.contains("M"))
                .collect(Collectors.toList());
    }

    public static Integer getPosicaoLista(Integer integer){

        return integer != null && integer > 0 ? integer : 0;
    }







}
