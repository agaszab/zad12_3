import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Program  {

    public static void main(String[] args) throws FileNotFoundException {

       Queue<Integer> liczby=new LinkedList<>();
       Set<Wystapienia> zbior = new TreeSet<>();

        File file=new File ("liczby.txt");
        Scanner scan=new Scanner(file);

        while (scan.hasNextInt()) {
        int liczba = scan.nextInt();
        liczby.add(liczba);
        }


      Wystapienia wyst = new Wystapienia();

      while (!liczby.isEmpty()) {
      int i = liczby.poll();
      System.out.print(i+" ");
      int zlicz=0;

        for (Integer elem:liczby) {
        if (elem.equals(i) ) {
            zlicz++;
        }
            wyst.setLiczba(i);
            wyst.setWystapienie(zlicz);


            zbior.add(wyst);

        }


}

        for (Wystapienia element:zbior) {
            System.out.println(element.getLiczba()+" - "+element.getWystapienie());
        }

    }
}
