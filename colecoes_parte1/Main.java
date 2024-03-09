import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        criacaoDeLista();
    }

    private static void criacaoDeLista() {
        List<String> lista = new ArrayList<>();
        lista.add("Jill Valentine");
        lista.add("Jhonatan Silva");
        lista.add("Carlos Oliveira");
        lista.add("Marco Aurelio");
        Collections.sort(lista);
        System.out.println(lista);

    }

}