public class GroceryItemOrder {

    private String produktnavn;
    private int amount;
    private int pris;

    public GroceryItemOrder(String produktnavn, int amount, int pris) {
        this.produktnavn = produktnavn;
        this.amount = amount;
        this.pris = pris;
    }

    public GroceryItemOrder(int i, String s) {

    }

    public String getProduktnavn() {
        return produktnavn;
    }

    public void setProduktnavn(String produktnavn) {
        this.produktnavn = produktnavn;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    @Override
    public String toString() {
        String output = "";
        output += "\n" + "Produktnavn: " + this.produktnavn + "\t" + "| Mængde: " + this.amount + "\t" + "| Pris: " + this.pris;
        return output;
    }

}

