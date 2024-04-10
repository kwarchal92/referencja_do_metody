package referencja_do_metody;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Zbyszek", "Adam", "Ewa", "Kamil", "Grzegorz", "Magdalena");

        Collections.sort(imiona, String::compareTo); //referencja do metody
        {
            System.out.println("Sortowanie listy według naturalnego porzadku");

            System.out.println(imiona);
        }
    }

}
