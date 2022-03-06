package inheritance;

public class Review {
    private String author;
    public  int authorReviw;


    public Review(String author, Integer authorReviw) {
        this.author = author;
        this.authorReviw = authorReviw;



    }

    public int Review() {
        this.authorReviw = authorReviw;
        return this.authorReviw;
    }



    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", authorReviw=" + authorReviw +
                '}';
    }
}
