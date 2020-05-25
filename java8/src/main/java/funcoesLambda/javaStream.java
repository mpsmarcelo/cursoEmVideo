package funcoesLambda;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.nio.cs.ArrayEncoder;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class javaStream {


    public static void main(String[] args) {

        List<Integer>  lista = Arrays.asList(1,2,2,3,5,6,7,8,9,10);
        lista.stream()
                .distinct()
                .filter(e -> e % 2 == 0)
                .limit(4)
                .forEach(e -> System.out.println(e))
                ;



//        Manipuladando dados da lista

        System.out.println("\n\n");

        List<Integer> listaInteiros = Arrays.asList(13,8,9,4,6,8);

        listaInteiros.stream()
                .skip(2)
                .limit(3)
                .map(e -> e * 3)
                .forEach(e  -> System.out.println(e));

    }
}
