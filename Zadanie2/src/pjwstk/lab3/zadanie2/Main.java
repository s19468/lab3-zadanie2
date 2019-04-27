/*
    Zadanie 2: Stworzenie klasy InvoiceItem używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie2;

public class Main {

    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("0", "Gramofon", 20, 4699.99);
        System.out.println(item);
        System.out.println("Total Price: " + item.getTotal());
    }
}