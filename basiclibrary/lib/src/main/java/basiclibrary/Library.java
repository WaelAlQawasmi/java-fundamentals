/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;

public  class Library {

    public  static int[] roll(int n) {
        int countIndex=0;

        int [] ui= new int[n];

        while (countIndex<n){
           double x =  Math.round(Math.random() * (6 - 1) + 1);
        ui[countIndex]= (int)x;
        countIndex++;
       }
       System.out.println(Arrays.toString(ui));
        return ui ;
    }

    public  static int[] lowestAverage(int[] []n) {

        int [] output=new int[n.length];
        int counter=0;
        for(int[]el:n){
            int avarege=0;
            for(int el2:el){
                avarege=avarege+el2;
        }
            output[counter]= avarege/el.length;
            counter++;
        }
System.out.println(Arrays.toString(output));
        System.out.println( Arrays.stream(output).min());

        int [] output2=new int[1];
        output2[0]=Arrays.stream(output).min().getAsInt();
               return output2;

    }


    public  static double calculatingAverages(int [] n) {
        double avarage=0;
        for (int el:n){
            avarage=avarage+el;
        }


        return  avarage/n.length;
    }






    public  static boolean containsDuplicates(int [] n) {
for(int el:n){
int count=0;
    for(int el2:n){

          if(el2==el){
              count++;
             if (count==2){
                    return false ;}}
    }

}

        return true ;
    }
}
