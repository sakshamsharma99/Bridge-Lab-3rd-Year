class Music {
    static String platform = "TuneBox";
    final int songId;
    String title;
    String artist;

    Music(int songId, String title, String artist) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
    }

    static void changePlatform(String newPlatform) {
        platform = newPlatform;
    }

    void displaySong() {
        if (this instanceof Music) {
            System.out.println("ID: " + songId + ", Title: " + title + ", Artist: " + artist + ", Platform: " + platform);
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Music m1 = new Music(1, "Shape of You", "Ed Sheeran");
        Music m2 = new Music(2, "Blinding Lights", "The Weeknd");
        m1.displaySong();
        m2.displaySong();
        Music.changePlatform("MusicHub");
        m1.displaySong();
        m2.displaySong();
    }
}
