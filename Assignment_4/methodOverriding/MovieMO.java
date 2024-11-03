public class MovieMO {
    private String movieName;
    private String director;
    private String producer;
    private String musicDirector;

    public MovieMO(String movieName, String director, String producer, String musicDirector) {
        this.movieName = movieName;
        this.director = director;
        this.producer = producer;
        this.musicDirector = musicDirector;
    }

    public void movieDetails() {
        System.out.println("Movie name : " + this.movieName + "\n" +
                        "Director : " + this.director + "\n" +
                        "Producer : " + this.producer + "\n" +
                        "Music director : " + this.musicDirector
//                "Total Budget : " + this.budget
        );
    }
}

class ThrillerMovie extends MovieMO{
    private String genreElement;

    public ThrillerMovie(String movieName, String director, String producer, String musicDirector, String genre) {
        super(movieName, director, producer, musicDirector);
        this.genreElement = genre;
    }

    @Override
    public void movieDetails() {
        super.movieDetails();
        System.out.println("Genre : " + this.genreElement);
    }
}

class AdventureMovie {

}

class MovieDemo1 {
    public static void main(String[] args) {
        MovieMO conjuring = new ThrillerMovie("Conjuring", "james wan", "abc", "ar rahman", "GhostThriller");
        conjuring.movieDetails();
    }
}
