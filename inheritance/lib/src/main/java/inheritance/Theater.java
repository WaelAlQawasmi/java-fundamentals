package inheritance;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Theater implements reviewInterface {
    private  String name;
    private ArrayList<String> movies=new ArrayList<>();

    private ArrayList<Review> Reviews=new ArrayList<>();
    public Theater(String name) {
        this.name = name;

    }
    public void addMovie(String name) {
        this.movies.add(name);
    }
    public void removeMovie(String name) {
this.movies.remove(name);
    }

    public  void addRevews(String ather,Integer review,String body){
        if (review<0 || review>5){
            System.out.println(" enter error,plese enter the review betwwen 0and 5");
        }
        else{

            Review newReviver=new Review(ather,review,body);
            System.out.println(" enter plese enter the the movie Name , Enter N if you don't like to mention the movie");
try {
    Scanner scanner=new Scanner(System.in);
    String moovie= scanner.nextLine();
    System.out.println(moovie);



    if(!Objects.equals(moovie, "N")){
        System.out.println(moovie);
        newReviver.setMovieName(moovie);

    }



}
catch (Exception e){

}
            Reviews.add(newReviver);


           }

    }



    public String AllReviews(){
        String Review="\n";
        for (int i = 0; i < Reviews.size(); i++) {

            Review=Review+Reviews.get(i).toString()+"\n";
        }
return Review;
    }

    @Override
    public String toString() {

        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + this.movies + AllReviews()+
                '}';
    }
}
