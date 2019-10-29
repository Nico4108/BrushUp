import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList
{
    public void groceryList()
    {
        String cookie = "Cookie";
        String mælk = "Mælk";
        String sodavand = "Sodavand";
        String æg = "Æg";
        String slik = "Slik";
        String brød = "Brød";
        String kaffe = "Kaffe";
        String bacon = "Bacon";
        String kylling = "Kylling";
        String thaibox = "Thaibox";
        String pizza = "Pizza";
        String energidrink = "EnergiDrink";
        String chokolade = "Chokolade";
        String chips = "Chips";
        String ost = "Ost";

        int cookieMængde = 1;
        int mælkMængde = 1;
        int sodavandMængde = 1;
        int ægMængde = 1;
        int slikMængde = 1;
        int brødMængde = 1;
        int kaffeMængde = 1;
        int baconMængde = 1;
        int kyllingMængde = 1;
        int thaiboxMængde = 1;
        int pizzaMængde = 1;
        int energiDrinkMængde = 1;
        int chokoladeMængde = 1;
        int chipsMængde = 1;
        int ostMængde = 1;



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
        System.out.println("Vælg produkt ved at taste produktets ID:");

        ArrayList<GroceryItemOrder> bestilling = new ArrayList<>();

        int maxprodukt = 0;
        int totalbeløb = 0;

        while(maxprodukt != 10) {
            Scanner sc = new Scanner(System.in);
            int valg = sc.nextInt();

            switch (valg) {
                case 1:
                    bestilling.add(new GroceryItemOrder(cookie, cookieMængde, cookiepris));
                    totalbeløb += cookiepris;
                    break;
                case 2:
                    bestilling.add(new GroceryItemOrder(mælk, mælkMængde, mælkpris));
                    totalbeløb += mælkpris;
                    break;
                case 3:
                    bestilling.add(new GroceryItemOrder(sodavand, sodavandMængde, sodavandpris));
                    totalbeløb += sodavandpris;
                    break;
                case 4:
                    bestilling.add(new GroceryItemOrder(æg, ægMængde, ægpris));
                    totalbeløb += ægpris;
                    break;
                case 5:
                    bestilling.add(new GroceryItemOrder(slik, slikMængde, slikpris));
                    totalbeløb += slikpris;
                    break;
                case 6:
                    bestilling.add(new GroceryItemOrder(brød, brødMængde, brødpris));
                    totalbeløb += brødpris;
                    break;
                case 7:
                    bestilling.add(new GroceryItemOrder(kaffe, kaffeMængde, kaffepris));
                    totalbeløb += kaffepris;
                    break;
                case 8:
                    bestilling.add(new GroceryItemOrder(bacon, baconMængde, baconpris));
                    totalbeløb += baconpris;
                    break;
                case 9:
                    bestilling.add(new GroceryItemOrder(kylling, kyllingMængde, kyllingpris));
                    totalbeløb += kyllingpris;
                    break;
                case 10:
                    bestilling.add(new GroceryItemOrder(thaibox, thaiboxMængde, thaiboxpris));
                    totalbeløb += thaiboxpris;
                    break;
                case 11:
                    bestilling.add(new GroceryItemOrder(pizza, pizzaMængde, pizzapris));
                    totalbeløb += pizzapris;
                    break;
                case 12:
                    bestilling.add(new GroceryItemOrder(energidrink, energiDrinkMængde, energidrikpris));
                    totalbeløb += energidrikpris;
                    break;
                case 13:
                    bestilling.add(new GroceryItemOrder(chokolade, chokoladeMængde, chokoladepris));
                    totalbeløb += chokoladepris;
                    break;
                case 14:
                    bestilling.add(new GroceryItemOrder(chips, chipsMængde, chipspris));
                    totalbeløb += chipspris;
                    break;
                case 15:
                    bestilling.add(new GroceryItemOrder(ost, ostMængde, ostpris));
                    totalbeløb += ostpris;
                    break;
            }
            System.out.println("Vælg endnu et produkt");
            maxprodukt += 1;

            //for (GroceryItemOrder e: bestilling){}

            /*for (int i = 0; i < bestilling.size(); i++)
            {
                if (i == valg)
                {
                    cookieMængde += 1;
                    mælkMængde += 1;
                    sodavandMængde += 1;
                    ægMængde += 1;
                    slikMængde += 1;
                    brødMængde += 1;
                    kaffeMængde += 1;
                    baconMængde += 1;
                    kyllingMængde += 1;
                    thaiboxMængde += 1;
                    pizzaMængde += 1;
                    energiDrinkMængde += 1;
                    chokoladeMængde += 1;
                    chipsMængde += 1;
                    ostMængde += 1;

                }
            }*/

            /*if (valg == valg)
            {
                cookieMængde += 1;
                mælkMængde += 1;
                sodavandMængde += 1;
                ægMængde += 1;
                slikMængde += 1;
                brødMængde += 1;
                kaffeMængde += 1;
                baconMængde += 1;
                kyllingMængde += 1;
                thaiboxMængde += 1;
                pizzaMængde += 1;
                energiDrinkMængde += 1;
                chokoladeMængde += 1;
                chipsMængde += 1;
                ostMængde += 1;

            }*/


        }
        System.out.println("Din indkøbskurv er fuld");
        System.out.println("Tryk '1' for din kvittering");
        Scanner sc2 = new Scanner(System.in);
        sc2.next();
        System.out.println("Kvittering:");
        System.out.println(bestilling);
        System.out.println("Total: "+totalbeløb+"kr");
    }
}
