import java.util.List;

public abstract class MovieAbstract {
    private String movieName;
    private String director;
    private String producer;
    private String musicDirector;

    public MovieAbstract(String movieName, String director, String producer, String musicDirector) {
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
    public abstract void setCastAndRoles(String actor, List<String> actress);
    public abstract void getCastAndRoles();
}

class ThrillerMovie1 extends MovieAbstract{
    private String genreElement;
    private String actor;
    private List<String> actress;

    public ThrillerMovie1(String movieName, String director, String producer, String musicDirector, String genre) {
        super(movieName, director, producer, musicDirector);
        this.genreElement = genre;
    }

    @Override
    public void movieDetails() {
        super.movieDetails();
        System.out.println("Genre : " + this.genreElement);
    }

    @Override
    public void setCastAndRoles(String actor, List<String> actress) {
        this.actor = actor;
        this.actress = actress;
    }

    @Override
    public void getCastAndRoles() {
        System.out.println("Actor : " + this.actor);
        System.out.println("Actress : " + this.actress);
    }
}

class MovieDemo2 {
    public static void main(String[] args) {
        MovieAbstract muni3 = new ThrillerMovie1("Muni 3 kanchana", "lawrence", "sun production", "S Thaman", "GhostThriller");
        muni3.movieDetails();
        muni3.setCastAndRoles("Lawrence", List.of("Oviya", "Vedika"));
        muni3.getCastAndRoles();
    }
}
