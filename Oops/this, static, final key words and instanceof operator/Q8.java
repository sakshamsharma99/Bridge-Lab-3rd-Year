class Movie {
    static String platform = "CinemaHub";
    final int movieId;
    String title;
    String genre;

    Movie(int movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
    }

    static void changePlatform(String newPlatform) {
        platform = newPlatform;
    }

    void displayMovie() {
        if (this instanceof Movie) {
            System.out.println("ID: " + movieId + ", Title: " + title + ", Genre: " + genre + ", Platform: " + platform);
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Movie m1 = new Movie(1, "Inception", "Sci-Fi");
        Movie m2 = new Movie(2, "Coco", "Animation");
        m1.displayMovie();
        m2.displayMovie();
        Movie.changePlatform("MovieMax");
        m1.displayMovie();
        m2.displayMovie();
    }
}
