public class Main {

    public static void main(String[] args) {
	// write your code here
        Director director1 = new Director();
        director1.setName("TKD");
        director1.setJob("Director");

        Actor actor1 = new Actor();
        actor1.setName("Top");
        actor1.setJob("Actor");

        Actor actor2 = new Actor();
        actor2.setName("Lamoon");
        actor2.setJob("Actor");

        Actor actor3 = new Actor();
        actor3.setName("Nan");
        actor3.setJob("Actor");

        Actor actor4 = new Actor();
        actor4.setName("Chalarm");
        actor4.setJob("Actor");

        Actor actor5 = new Actor();
        actor5.setName("Brie Cheese");
        actor5.setJob("Actor");

        Review review1 = new Review();
        review1.setDisplayName("Anon1");
        review1.setContent("Very good movie!");

        Review review2 = new Review();
        review2.setDisplayName("AnonZa");
        review2.setContent("Greatest of All Time!");

        Movie movie1 = new Movie();
        movie1.setTitle("60 seconds to be gone.");
        movie1.setDirector(director1);
        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.addActor(actor3);
        movie1.addActor(actor4);
        movie1.addActor(actor5);
        movie1.addReview(review1);
        movie1.addReview(review2);

        movie1.retrieveReviews();
    }
}
