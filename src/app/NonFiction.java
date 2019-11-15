package app;

/**
 * NonFiction
 */
public class NonFiction implements Genre{
    private static double genreDiscount = 0;
    private String subGenre;
    private final String genre = "non-fiction";

    public NonFiction(){}
    public NonFiction(String subGenre) {
        this.subGenre = subGenre;
    }

    public String getGenre() {return this.genre;}

    public double getGenreDiscount() {return NonFiction.genreDiscount;}
    public static void setGenreDiscount(double discount) {NonFiction.genreDiscount = discount;}

    @Override
    public String getSubGenre() {return this.subGenre;}
    @Override
    public void setSubGenre(String subGenre) {this.subGenre = subGenre;}

    public String toString() {
        return "\nGenre: " + this.genre 
                + ", Subgenre: " + this.subGenre;
    }
}