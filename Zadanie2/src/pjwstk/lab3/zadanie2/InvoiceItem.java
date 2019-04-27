/*
    Zadanie 2: Stworzenie klasy InvoiceItem używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie2;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return getUnitPrice() * getQty();
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + getID() +
                ",desc=" + getDesc() +
                ",qty=" + getQty() +
                ",unitPrice=" + getUnitPrice() + "]";
    }
}
