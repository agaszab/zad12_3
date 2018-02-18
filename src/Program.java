import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> liczby = new ArrayList<>();
        TreeMap<Integer, Integer> zbior = new TreeMap<>();

        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextInt()) {
            int liczba = scan.nextInt();
            liczby.add(liczba);
                                                                 //  wypisanie kontrolne wszystkich liczb z pliku  System.out.println(liczba);
        }

        int k = 0;

        for (int i = 0; i < liczby.size(); i++) {
            k = liczby.get(i);
            int zlicz = 0;

            for (int j = 0; j < liczby.size(); j++) {
                if (k == liczby.get(j))
                    zlicz++;

            }
            zbior.put(k, zlicz);

        }

        for (Map.Entry<Integer, Integer> entry : zbior.entrySet()) {
            System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());

        }

    }

}




