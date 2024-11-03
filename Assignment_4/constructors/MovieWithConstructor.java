public class MovieWithConstructor {
    private String movieName;
    private String director;
    private String producer;
    private String musicDirector;
    private float budget;

    public MovieWithConstructor(String movieName, String director, String producer, String musicDirector, float budget) {
        this.movieName = movieName;
        this.director = director;
        this.producer = producer;
        this.musicDirector = musicDirector;
        this.budget = budget;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName() {
        return movieName;
    }

    public void setName(String movieName) {
        this.movieName = movieName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public void movieDetails() {
        System.out.println("Movie name : " + this.movieName + "\n" +
                "Director : " + this.director + "\n" +
                "Producer : " + this.producer + "\n" +
                "Music director : " + this.musicDirector
//                "Total Budget : " + this.budget
        );

        System.out.println();
    }
}

class MovieDemo {
    public static void main(String[] args) {
        MovieWithConstructor leo = new MovieWithConstructor("Leo", "Lokesh Kanagaraj", "7 screens", "Aniruth", 400000000.0f);
        leo.movieDetails();
    }
}
