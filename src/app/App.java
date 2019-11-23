package app;

public class App {
    public static void main(String[] args) throws Exception {
        Fiction.setGenreDiscount(9);
        NonFiction.setGenreDiscount(10);

        Author a1 = new Author("John Green", "green@example.com", 42, "male");
        Author a2 = new Author("JK Rowling", "rowling@exmaple.com", 54, "female");
        Author a3 = new Author("Nicholas Sparks", "sparks@exmaple.com", 53, "male");
        Author a4 = new Author("Rick Riordan", "riordan@exmaple.com", 55, "male");
        Author a5 = new Author("Stephen Hawking", "", -1, "male");
        Author a6 = new Author("Dan Brown", "brown@exmaple.com", 55, "male");
        Author a7 = new Author("Stephen King", "king@exmaple.com", 72, "male");
        Author a8 = new Author("Malcolm Gladwell", "gladwell@exmaple.com", 56, "male");
        Author a9 = new Author("Kyo Maclear", "maclear@exmaple.com", 49, "female");
                        
        Book b0 = new Book("The Burning Maze", 250, a4, 10.6, new Fiction("fantasy"), "9123567891208", 2018);
        Book b1 = new Book("The Philosopher's Stone", 550, a2, 10.3, new Fiction("fantasy"), "9123567891201", 1997);
        Book b2 = new Book("The Chamber of Secrets", 450, a2, 10.2, new Fiction("fantasy"), "9123567891202", 1998);
        Book b3 = new Book("The Prisoner of Azkaban", 330, a2, 8.5, new Fiction("fantasy"), "9123567891203", 1999);
        Book b4 = new Book("The Goblet of Fire", 300, a2, 7.3, new Fiction("fantasy"), "9123567891205", 2000);
        Book b5 = new Book("Looking for Alaska", 500, a1, 10.8, new Fiction("Young adult fiction"), "9123567891206", 2005);
        Book b6 = new Book("Paper Towns", 250, a1, 8, new Fiction("mystry"), "9123567891207", 2008);
        Book b7 = new Book("A Walk to Remember", 350, a3, 9.5, new Fiction("drama"), "9123567891220", 2002);
        Book b8 = new Book("The Lightning Thief", 450, a4, 8.4, new Fiction("fantasy"), "9123567891204", 2005);
        Book b9 = new Book("The House of Hades", 150, a4, 10.5, new Fiction("fantasy"), "9123567891209", 2013);
        Book b10 = new Book("Inferno", 450, a6, 10.6, new Fiction("thriller"), "9123567891221", 2013);
        Book b11 = new Book("Deception point", 550, a6, 10.6, new Fiction("mystry"), "9123567891210", 2001);
        Book b12 = new Book("angels and demons", 430, a6, 10.5, new Fiction("crime"), "9123567891211", 2000);
        Book b13 = new Book("Da Vinci Code", 470, a6, 11.5, new Fiction("crime"), "9123567891212", 2000);
        Book b14 = new Book("Origin", 370, a6, 11.5, new Fiction("crime"), "9123567891219", 2017);
        Book b15 = new Book("A Brief History of Time", 330, a5, 5.5, new NonFiction("science"), "9123567891213", 1998);
        Book b16 = new Book("The Theory of Everything", 420, a5, 6.3, new NonFiction("science"), "9123567891214", 2004);
        Book b17 = new Book("God Created the Integers", 423, a5, 7.2, new NonFiction("biography"), "9123567891215", 2005);
        Book b18 = new Book("The Green Mile", 270, a7, 11.5, new Fiction("fantasy"), "9123567891216", 1996);
        Book b19 = new Book("Blink", 423, a8, 7.2, new NonFiction("self-help"), "9123567891217", 2005);
        Book b20 = new Book("Birds Art Life", 403, a9, 3.0, new NonFiction("biography"), "9123567891218", 2017);
        
        BookCollection c = new BookCollection();

        //Book collection input set for problem task 1, 2
        c.addBook(b0); c.addBook(b5); c.addBook(b1); c.addBook(b3); c.addBook(b4); c.addBook(b2); 


        //Book collection input set task 3,4
        //c.addBook(b0); c.addBook(b15); c.addBook(b1); c.addBook(b3); c.addBook(b4); c.addBook(b2); 
        // c.addBook(b6); c.addBook(b18); c.addBook(b17); c.addBook(b11); c.addBook(b10); c.addBook(b19);
        // c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b5); c.addBook(b16); c.addBook(b7);
        // c.addBook(b8); c.addBook(b9); c.addBook(b20);




        // c.addBook(b18); c.addBook(b19); c.addBook(b20); c.addBook(b18); c.addBook(b1); c.addBook(b1);
        // c.addBook(b1); c.addBook(b1); c.addBook(b18); c.addBook(b14); c.addBook(b15); c.addBook(b13);
        // c.addBook(b16); c.addBook(b17); c.addBook(b17);c.addBook(b2); c.addBook(b3); c.addBook(b17);
        // c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b15); c.addBook(b16); c.addBook(b17);
        // c.addBook(b18); c.addBook(b19); c.addBook(b20); c.addBook(b18); c.addBook(b1); c.addBook(b1);
        // c.addBook(b1); c.addBook(b1); c.addBook(b18); c.addBook(b14); c.addBook(b15); c.addBook(b13);
        // c.addBook(b16); c.addBook(b17); c.addBook(b17);c.addBook(b2); c.addBook(b3); c.addBook(b17);
        // c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b15); c.addBook(b16); c.addBook(b17);
        // c.addBook(b18); c.addBook(b19); c.addBook(b20); c.addBook(b18); c.addBook(b1); c.addBook(b1);
        // c.addBook(b1); c.addBook(b1); c.addBook(b18); c.addBook(b14); c.addBook(b15); c.addBook(b13);
        // c.addBook(b16); c.addBook(b17); c.addBook(b17);c.addBook(b2); c.addBook(b3); c.addBook(b17);
        // c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b15); c.addBook(b16); c.addBook(b17);
        // c.addBook(b18); c.addBook(b19); c.addBook(b20); c.addBook(b18); c.addBook(b1); c.addBook(b1);
        // c.addBook(b1); c.addBook(b1); c.addBook(b18); c.addBook(b14); c.addBook(b15); c.addBook(b13);
        // c.addBook(b16); c.addBook(b17); c.addBook(b17);c.addBook(b2); c.addBook(b3); c.addBook(b17);
        // c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b15); c.addBook(b6); c.addBook(b17);
        // c.addBook(b18); c.addBook(b19); c.addBook(b20); c.addBook(b18); c.addBook(b1); c.addBook(b1);
        // c.addBook(b1); c.addBook(b1); c.addBook(b18); c.addBook(b14); c.addBook(b15); c.addBook(b13);
        // c.addBook(b16); c.addBook(b17); c.addBook(b17);c.addBook(b2); c.addBook(b3); c.addBook(b17);
        // c.addBook(b0); c.addBook(b1); c.addBook(b2); c.addBook(b3); c.addBook(b4); c.addBook(b5); 
        // c.addBook(b6); c.addBook(b7); c.addBook(b8); c.addBook(b9); c.addBook(b10); c.addBook(b11);
        // c.addBook(b0); c.addBook(b1); c.addBook(b2); c.addBook(b3); c.addBook(b4); c.addBook(b5); 
        // c.addBook(b6); c.addBook(b7); c.addBook(b8); c.addBook(b9); c.addBook(b10); c.addBook(b11);
        // c.addBook(b0); c.addBook(b1); c.addBook(b2); c.addBook(b3); c.addBook(b4); c.addBook(b5); 
        // c.addBook(b6); c.addBook(b7); c.addBook(b8); c.addBook(b9); c.addBook(b10); c.addBook(b11);

        // for(int i = 1; c.hasNext(); i++)
        //     System.out.print(i + "." + c.getNext() + "\n");

        c.sortByYearOfPublish();

        c.resetBooks();
        for(int i = 1; c.hasNext(); i++){
            Book item = c.getNext();
            System.out.print(i + "." + item.getName() + item.getIsbn()  +"\n");
        }
        // Book p1 = c.getBook("9123567891220");
        // Book p2 = c.getBook("9123567891201");

        // Invoice in = new Invoice();

        // in.addBook(p1); in.addBook(p2);

        // System.out.println(in);

        // c.resetBooks();
        // for(int i = 1; c.hasNext(); i++)
        //     System.out.print(i + "." + c.getNext().getName() + "\n");


        // // c.resetBooks();
        // // while(c.hasNext()){
        // //     Book temp = c.getNext();
        // //     System.out.println(temp.getName() + ", " + temp.getIsbn());
        // // }
        // // System.out.println();
        // // c.sortByYearOfPublish();
        // // c.resetBooks();
        // // for(int i = 1; c.hasNext(); i++){
        // //     Book temp = c.getNext();
        // //     System.out.print(temp.getName() + ", " 
        // //                         + temp.getWriter().getName() + ", "  
        // //                         + temp.getYearOfPublish() + "\n");
        // //} 

//task 3
        // int count = 0;
        // Author names[] = new Author[9];
        // int authorIndex = 0; 
        // while(c.hasNext()){
        //     Book temp = c.getNext();
        //     if(temp.getWriter().getAge() > 50 && temp.getWriter().getAge() < 55){
        //         boolean inArray = false;
        //         for(int i = 0; i < authorIndex; i++){
        //             if(temp.getWriter().getName() == names[i].getName()){
        //                 inArray = true;
        //                 break;
        //             }
        //         }
        //         if(!inArray){
        //             names[authorIndex++] = temp.getWriter();
        //         }
        //     }
                
        // }

        // System.out.println(authorIndex);
        // for(int i = 0; i < authorIndex; i++){
        //     System.out.println(names[i].getName() + ", " + names[i].getAge());
        // }
//task 4

        // Book cheapest = new Book();
        // cheapest.setPrice(900000);
        
        // c.resetBooks();
        // while(c.hasNext()){
        //     Book temp = c.getNext();
        //     if(temp.getPrice() < cheapest.getPrice()){
        //         cheapest = temp;
        //     }
        // }

        // System.out.println(cheapest.getName() + ", " + cheapest.getPrice());

        // Book highestDiscount = new Book();
        // highestDiscount.setBookDiscount(-1);
        
        // c.resetBooks();
        // while(c.hasNext()){
        //     Book temp = c.getNext();
        //     if(temp.getBookDiscount() > highestDiscount.getBookDiscount())
        //         highestDiscount = temp;
        // }

        // System.out.println(highestDiscount.getName() + ", " 
        //                     + highestDiscount.getPrice() + ", "
        //                     +highestDiscount.getBookDiscount());


        // c.resetBooks();
        // while(c.hasNext()){
        //     Book temp = c.getNext();
        //     if(temp.getGenre().getGenre() == "fiction" 
        //         && temp.getGenre().getSubGenre() == "crime" && temp.getYearOfPublish() > 2010)
        //         System.out.println(temp.getName() + ", " + temp.getWriter().getName());
        // }

        // Invoice i = new Invoice();

        // i.addBook(b1);
        // i.addBook(b2);
        // i.addBook(b3);
        // i.addBook(b8);

        // // System.out.println("p: " + i.calculatePrice());
        // // System.out.println("a: " + i.calculatAuthorDiscount());
        // // System.out.println("b: " + i.calculateBookDiscount());
        // // System.out.println("g: " + i.calculateGenreDiscount());
        // System.out.println("f: " + i.getFinalPrice());

        // System.out.println(i.toString());
    }
}