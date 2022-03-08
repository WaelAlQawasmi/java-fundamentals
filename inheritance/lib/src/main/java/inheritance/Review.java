package inheritance;

public class Review {
    private String author;
    private String body;
    public  int authorReviw;
    private String MovieName=null;

    public Review(String author, Integer authorReviw,String body) {
        this.author = author;
        this.authorReviw = authorReviw;
this.body=body;


    }



    public int Review() {
        this.authorReviw = authorReviw;
        return this.authorReviw;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    @Override
    public String toString() {
        if(this.MovieName!=null){
            return "Review{" +
                    "author='" + author + '\'' +
                    ", body='" + body + '\'' +
                    ", authorReviw=" + authorReviw + " , MovieName="+MovieName+
                    '}';
        }
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", authorReviw=" + authorReviw +
                '}';
    }
}
