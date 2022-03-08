package inheritance;

import java.util.ArrayList;

public interface reviewInterface {
    ArrayList<Review> reviews=new ArrayList<>();


    void addRevews(String ather, Integer review,String body);


    String AllReviews();
}
