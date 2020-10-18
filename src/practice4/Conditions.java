package practice4;

public class Conditions {

    public static void main(String[] args) {

        // soccer - sunday
        // class - monday
        // guitar - friday
        // chill at my home - other days

        String today= "Mouh";

        if (today.equalsIgnoreCase("Monday")) {
            System.out.println("I'll go to soccer");
        } else{ if (today.equalsIgnoreCase("Saturday")) {
            System.out.println("I'll study");
        }else
            System.out.println("I'll hangout with my friends");
        }

        boolean isTodaySunny= false;
        if (isTodaySunny){
            System.out.println("let's go fishing");}
        else
            System.out.println("let's stay home and chill");


        }

}
