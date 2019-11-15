package app;

import java.util.Arrays;

/**
 * BookCollection
 */
public class BookCollection {
    private final int maxSize = 10000;
    private Book books[] = new Book[maxSize];
    private static int numberOfBooks = 0;
    private int nextIndex = 0;

    public BookCollection(){
        for(int i = 0; i<maxSize; i++)
            books[i] = new Book();
    }

    public boolean addBook(Book book){
        if(numberOfBooks < maxSize){
            books[numberOfBooks++] = book;
            return true;
        } 
        return false;
    }

    private void removeBook(int index){
        for(; index < numberOfBooks; index++){
            books[index] = books[index+1];
        } 
        numberOfBooks--;
    }

    public Book getBook(String isbn){
        int index = searchByIsbn(isbn);
        if(index >= 0){
            Book b = books[index];
            removeBook(index);
            return b;
        }
        return null;
    }

    public int searchByIsbn(String isbn){
        for(int i = 0; i < numberOfBooks; i++){
            if(books[i].getIsbn() == isbn) return i;
        }
        return -1;
    }

    public Book getNext(){return (nextIndex < numberOfBooks) ? books[nextIndex++] : null;}

    public boolean hasNext(){return (nextIndex < numberOfBooks) ? true : false;}
    
    public void resetBooks(){nextIndex = 0;}

    public void sortByIsbn(){
        Arrays.sort(books, 0, numberOfBooks);
    }

    public void sortByYearOfPublish(){
        int i, j;
        Book key;  
        for (i = 1; i < numberOfBooks; i++) 
        {  
            key = books[i];  
            j = i - 1;  
      
            while (j >= 0 && books[j].getYearOfPublish() > key.getYearOfPublish()) 
            {  
                books[j + 1] = books[j];  
                j = j - 1;  
            }  
            books[j + 1] = key;  
        }
    }
}