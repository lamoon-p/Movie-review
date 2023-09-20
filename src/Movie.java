import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private List<Actor> actors = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
    
    public void retrieveReviews() {

        for (Review review : reviews) {
            System.out.println(review);
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", actors=" + actors +
                ", reviews=" + reviews +
                '}';
    }
}
