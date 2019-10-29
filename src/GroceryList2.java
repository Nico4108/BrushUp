import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList2
{
    int total = 0;
    public void groceryList2() throws IOException
    {
        int cookiepris = 10;
        int mælkpris = 7;
        int sodavandpris = 9;
        int ægpris = 12;
        int slikpris = 22;
        int brødpris = 5;
        int kaffepris = 20;
        int baconpris = 15;
        int kyllingpris = 25;
        int thaiboxpris = 24;
        int pizzapris = 19;
        int energidrikpris = 15;
        int chokoladepris = 14;
        int chipspris = 19;
        int ostpris = 26;


        System.out.println("1.Cookie "+cookiepris+"kr");
        System.out.println("2.Mælk "+mælkpris+"kr");
        System.out.println("3.Sodavand "+sodavandpris+"kr");
        System.out.println("4.Æg "+ægpris+"kr");
        System.out.println("5.Slik "+slikpris+"kr");
        System.out.println("6.Brød "+brødpris+"kr");
        System.out.println("7.Kaffe "+ kaffepris+"kr");
        System.out.println("8.Bacon "+ baconpris+"kr");
        System.out.println("9.Kylling "+kyllingpris+"kr");
        System.out.println("10.Thaibox "+thaiboxpris+"kr");
        System.out.println("11.Pizza "+pizzapris+"kr");
        System.out.println("12.Energidrik "+energidrikpris+"kr");
        System.out.println("13.Chokolade "+chokoladepris+"kr");
        System.out.println("14.Chips "+chipspris+"kr");
        System.out.println("15.Ost "+ostpris+"kr");

        ArrayList<GroceryItemOrder> ALGIO = new ArrayList<>();
        ArrayList<String> id = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/nicspiegelhauer/Documents/Skole/2. Semester/Konstruktion/Opgaver /Grocery List/BrushUp/src/ProduktListe.txt"));
        String line;

        while ((line = br.readLine()) != null)
        {
            id.add(line);
        }
        br.close();

        System.out.println("Vælg produkt ID");
        Scanner sc = new Scanner(System.in);
        String produktID = sc.next();

        String findProduktID = "";

        for (int i = 0; i < id.size(); i++)
        {
            if (id.get(i).split(",")[1] != null);
            {
               ALGIO.add(new GroceryItemOrder(Integer.parseInt(id.get(i).split(",")[0]), (id.get(i).split(",")[1])));
            }

        }

        for (int i = 0; i < ALGIO.size(); i++)
        {
            if (ALGIO.get(i).getProduktnavn() == produktID)
            {
                findProduktID = (ALGIO.get(i).getProduktnavn());

                total = total + Integer.parseInt(findProduktID);
                System.out.println("Test2");

            }
        }
        System.out.println("Test4");
        System.out.println(total + "kr");

    }
}
