package practice4;

public class ConditionalForLoop {
    public static void main(String[] args){

        for(int i=0; i<10; i++) {
            if(i != 5 && i!=6)  {
                System.out.println("i is my lucky number: "+ i);
            }
            else {
                System.out.println("i is not my lucky number: "+ i);
            }
        }
    }
}
