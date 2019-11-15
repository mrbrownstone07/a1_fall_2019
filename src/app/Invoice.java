package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Invoice
 */
public class Invoice {
    private Book books[] = new Book[50];
    private int numberOfBooks = 0;
    private LocalDateTime dateTimeStamp;
    private HashMap<String, Integer> m = new HashMap<String, Integer>();

    public Invoice(){
        this.dateTimeStamp = LocalDateTime.now();
    }

    public void addBook(Book book){
        this.books[numberOfBooks++] = book;
        if(m.containsKey(book.getWriter().getName())){
            m.put(book.getWriter().getName(), m.get(book.getWriter().getName()) + 1);
        }else m.put(book.getWriter().getName(), 1);
        
    }

    public double getFinalPrice(){
        double b = calculateBookDiscount();
        double g = calculateGenreDiscount();
        double a = (checkForAuthorDiscount()) ? calculatAuthorDiscount() : -1;
        
        return (a >= 0) ? Math.min(a, Math.max(b, g)) : (b < g) ? b : g;
    }

    private boolean checkForAuthorDiscount(){
        for (Map.Entry entry : m.entrySet()) { 
            if( (int)entry.getValue() >= 3 ) return true;
        }
        
        return false;
    }

    private double calculatePrice(){
        double price = 0;
        for(int i = 0; i < numberOfBooks; i++){
            price +=  books[i].getPrice();
        }
        return price;
    }

    private double calculatAuthorDiscount(){
        double price = 0.0;
        for(int i = 0; i < numberOfBooks; i++){
            if (m.containsKey(books[i].getWriter().getName()) && (int) m.get(books[i].getWriter().getName()) >= 3){
                price += (books[i].getPrice() - ((45.00 / 100.00 )* books[i].getPrice()));
            }
            else price += books[i].getPrice();
        }
        return price;
    }

    private double calculateBookDiscount(){
        double price = 0.0;
        for(int i = 0; i < numberOfBooks; i++){
            Book temp = books[i];
            price += (temp.getPrice() - (temp.getPrice() * (temp.getBookDiscount() / 100.00)));
        }
        return price;
    }

    private double calculateGenreDiscount(){
        double price = 0.0;
        for(int i = 0; i < numberOfBooks; i++){
            Book temp = books[i];
            price += (temp.getPrice() - (temp.getPrice() * (temp.getGenre().getGenreDiscount()/100.00)));
        }
        return price;
    }

    public void printMap(){
        for (Map.Entry entry : m.entrySet()) { 
            System.out.println(entry.getValue() + "->" + entry.getKey());
        }
    }

    private String getDateTime(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        return dateTimeStamp.format(format);
    }

    @Override
    public String toString() {
        String s = "";
        s += "purchase date: " + getDateTime() + "\n";
        for(int i = 0; i < numberOfBooks; i++)
            s += (i+1) + ". " + books[i].getName() + ": " + books[i].getPrice() + "\n";
        s += "price: " + this.calculatePrice() + "\n" ;
        s += "price after discount: " + this.getFinalPrice() + "\n";
        
        return s;
    }   
}

