package inheritance;

import java.util.ArrayList ;

public class Shop implements reviewInterface{
     private  String name;
    private  String  description;
    private  String number_of_dollar_signs;
    private  int stars;

ArrayList<Review> reviews=new ArrayList<>();

    public Shop(String name, String description, String number_of_dollar_signs) {

        this.name = name;
        this.description = description;
        this.number_of_dollar_signs = number_of_dollar_signs;
    }

    public  void addRevews(String ather,Integer review,String body){
        if (review<0 || review>5){
            System.out.println(" enter error,plese enter the review betwwen 0and 5");
        }
        else{
            Review newReviver=new Review(ather,review,body);
            reviews.add(newReviver);

            reReview();}

    }
    public void reReview(){
        int counter=0;

        for (int i = 0; i < reviews.size(); i++) {
            counter=counter+ reviews.get(i).Review();

        }

        this.stars=counter/reviews.size();

    }
    public void  getReview(){
        System.out.println( "THE review of  "+this.name+" restorant is "+this.stars);
    }

    public String AllReviews(){
        String Review="\n";
        for (int i = 0; i < reviews.size(); i++) {

            Review=Review+reviews.get(i).toString()+"\n";
        }
        return Review;
    }





    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", number_of_dollar_signs='" + number_of_dollar_signs + '\'' +
                '}' +AllReviews();
    }











}
