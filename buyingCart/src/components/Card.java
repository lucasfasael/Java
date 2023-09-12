package components;

public class Card {
    private double limit;
    private double invoice;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getInvoice() {
        return invoice;
    }

    public void addInvoice(double price){
        invoice += price;
    }
}
