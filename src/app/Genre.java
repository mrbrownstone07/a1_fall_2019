package app;

/**
 * Genre
 */
public interface Genre {
    public String getGenre();
    public String getSubGenre();
    public void setSubGenre(String subGenre);
    public String toString();
    public double getGenreDiscount();
}