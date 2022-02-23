package br.fai.ex04;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        iterarUsandoWhile();
        iterarUsandoDoWhile();
        iterarUsandoFor();
    }

    private void iterarUsandoWhile() {
        int i = 0;

        while(i < 20){
            System.out.println("valor i: " + i);
            i++;
        }

        System.out.println("-----------------------");
    }

    private void iterarUsandoDoWhile() {
        int k = 0;

        do {
            System.out.println("valor k: " + k);
            k++;
        }while (k < 20);

        System.out.println("-----------------------");
    }

    private void iterarUsandoFor() {

        for(int j = 0; j < 20; j++) {
            System.out.println("valor j: " + j);
        }
    }
}
