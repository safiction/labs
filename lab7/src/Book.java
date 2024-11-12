public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 1;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {return name;}
    public void setName(String newName) {
        if (newName.length() > 2)
            name = newName;
    }

    public Author getAuthor() {return author;}
    public void setAuthor(Author newAuthor) {
        if (newAuthor != null)
            author = newAuthor;
    }

    public double getPrice() {return price;}
    public void setPrice(double newPrice) {
        if (newPrice>0)
            price = newPrice;
    }

    public int getQty() {return qty;}
    public void setQty(int newQty) {
        if (newQty>0 && newQty<100)
            qty = newQty;
    }

    public String toString() {
        String s = author.toString();
        return "Book [name = " + getName() + ", " + s + ", price = " + getPrice()  + ", qty = " + getQty() + "]";
    }
}
