/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab3;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {



        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(tally(votes)+" received the most votes!");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        AnalyzingWeather(weeklyMonthTemperatures);

    }

    public static int AnalyzingWeather (int[][] data) {
        Set<Integer> uniqTem= new HashSet<>();
int min=data[0][0];
int max=data[0][0];
       for(int[] el:data){
           for (int el2:el)
           {
               uniqTem.add(el2);
             if(min>el2){
                 min=el2;
             }
             if(el2>max){
                 max=el2;
             }


           }
       }

    System.out.println("max=> "+max);
        System.out.println("max=> "+min);

        for (int i = min; i < max; i++) {
            if(uniqTem.contains(i)){
                continue;
            }
            else {
                System.out.println("Never saw temperature: "+i);
            }

        }
        return max;
    }


    public static String tally  (ArrayList<String> data) {
        HashMap<String, Integer> candcat = new HashMap<String, Integer>();
        for(String el:data){
            if(candcat.get(el)==null){
                candcat.put(el, 1);
            }
            else{
                candcat.put(el, candcat.get(el)+1);
            }

        }

        String Winner="";
        int Maxvotes=0;
        for (String el: candcat.keySet()) {
            if(candcat.get(el)>Maxvotes){
                Maxvotes=candcat.get(el);
                Winner=el;
            }

        }
       // System.out.println(candcat);

return Winner;
    }


}
