package classeOptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ExplorandoOptional {

    public static void main(String[] args) {
        String s = "1";
        converteStringEmInteiro(s).ifPresent(e -> System.out.println("valor convertido : " + e));

        Integer numero = converteStringEmInteiro(s).orElse((2));
        System.out.println("Função orElse: " + numero);


        //orElseGet permite passar como parametro um metodo quando valor não encontrado.
        s = null;

        Integer numeroElseGet = converteStringEmInteiro(s).orElseGet(()->retornaValorQualquer());
//        Integer numeroElseGet = converteStringEmInteiro(s).orElseGet(ExplorandoOptional::retornaValorQualquer);  <-- (pode ser substituido por)
        System.out.println("Função orElseGet: " + numeroElseGet);

    }

    static Integer retornaValorQualquer(){
        return 3;
    }

    static Optional<Integer> converteStringEmInteiro(String valor) {
        try {
            Integer integer = Integer.valueOf(valor);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
        }

    }


}
