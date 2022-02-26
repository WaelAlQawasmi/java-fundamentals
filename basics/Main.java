
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;
public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(2);

        LocalDateTime now = LocalDateTime.now();
        int lastSecond=now.getSecond();

        while (1==1){
            now=LocalDateTime.now();
            if(lastSecond!=now.getSecond()){
                lastSecond = now.getSecond();
                String timeNow = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(timeNow);}

        }

    }

    public static void flipNHeads(int num){
        int count=0;
        int countFlips=0;

        while (count<num){
            double rand= Math.random();

            if(rand<.5){count=0;
                countFlips++;
                System.out.println("tails");
            }
            else {countFlips++;
                System.out.println("heads");
                count++;
            }
        }
        System.out.println("It took " +countFlips+ " flips to flip "+num+ " head in a row.");
    }

    public static String pluralize(String Word,int count) {
        if(count>1||count==0)
        {
            return Word+"s";
        }
        else {
            return Word;
        }

    }
}