package funcoesLambda;

import sun.awt.windows.ThemeReader;

public class javaLambda {

    public static void main(String[] args) {

        new Thread(new Runnable(){

            public void run() {
                System.out.println("Ola mundo!");
            }

        }).run();

        new Thread(()-> System.out.println("Ola mundo, lambda!")).run();
    }
}
