package app;

/**
 * Book
 */
public class Book implements Comparable<Book>{
    private String name;
    private double price;
    private Author writer;
    private double bookDiscount;
    private String isbn;
    private Genre genre;
    private int yearOfPublish;

    public Book(){ }
    public Book(String name, double price, Author writer, double bookDiscount, 
                    Genre genre, String isbn, int yearOfPublish) {
        this.name = name;
        this.price = price;
        this.writer = writer;
        this.bookDiscount = bookDiscount;
        this.genre = genre;
        this.isbn = isbn;
        this.yearOfPublish = yearOfPublish;
        
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public Author getWriter() {return writer;}
    public void setWriter(Author writer) {this.writer = writer;}

    public double getBookDiscount() {return bookDiscount;}
    public void setBookDiscount(double bookDiscount) {this.bookDiscount = bookDiscount;}

    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    public int getYearOfPublish() {return yearOfPublish;}
    public void setYearOfPublish(int yearOfPublish) {this.yearOfPublish = yearOfPublish;}
    
    public void setGenre(Genre genre){this.genre = genre;}
    public Genre getGenre(){return this.genre;}

    public String toString(){
        return "Book Name: " + this.name 
                + ", Author: " + this.writer.getName()
                + ", Price: " + this.price
                + ", Year Of Publish: " + this.yearOfPublish
                + ", ISBN: " +this.isbn
                + this.genre.toString();
    }

    @Override
    public int compareTo(Book otherBook) {
        int flag = Compare.stringCompare(this.isbn, otherBook.isbn);

        // return (flag > 0) ? 1 : (flag < 0) ? -1 : 0;

        if(flag > 0) return 1;
        if (flag < 0) return -1;
        else return 0;
    }
}