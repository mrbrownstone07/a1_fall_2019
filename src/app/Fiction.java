package app;

/**
 * Fiction
 */
public class Fiction implements Genre {
    private static double genreDiscount = 0;
    private String subGenre;
    private final String genre = "fiction";

    public Fiction(){}
    public Fiction(String subGenre) {
        this.subGenre = subGenre;
    }
    
    public String getGenre() {return this.genre;}

    public double getGenreDiscount() {return Fiction.genreDiscount;}
    public static void setGenreDiscount(double discount) {Fiction.genreDiscount = discount;}

    @Override
    public String getSubGenre() {return this.subGenre;}
    @Override
    public void setSubGenre(String subGenre) {this.subGenre = subGenre;}

    @Override
    public String toString() {
        return "\nGenre: " + this.genre 
                + ", Subgenre: " + this.subGenre;
    }
}