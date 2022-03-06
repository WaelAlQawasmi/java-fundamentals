package inheritance;

import java.util.ArrayList;


public class Restaurant {

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int stars;
    private String price;

    ArrayList<Review> Reviews = new ArrayList<>();
    public Restaurant(String name, String price) {
        this.name = name;


this.stars=5;

        this.price = price;

    }
public  void addRevews(String ather,Integer review){
        if (review<0 || review>5){
            System.out.println(" enter error,plese enter the review betwwen 0and 5");
        }
        else{
        Review newReviver=new Review(ather,review);
    Reviews.add(newReviver);

       reReview();}

}
public void reReview(){
        int counter=0;

    for (int i = 0; i < Reviews.size(); i++) {
        counter=counter+ Reviews.get(i).Review();

    }

    this.stars=counter/Reviews.size();

}
public void  getReview(){
    System.out.println( "THE review of  "+this.name+" restorant is "+this.stars);
}
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }


}
