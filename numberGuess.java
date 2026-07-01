import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class numberGuess {
    public static void main(String[] srgs){
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int randint=random.nextInt(1,101);
        int counter=1;
        try{
            System.out.println("Enter your number");
            int num=input.nextInt();
            if(num==randint){
                System.out.println("Your have found the number in your 1th chance");
                 
            }
        while(num!=randint || num==randint){
            if(num>randint){
                System.out.println("Select a number smaller than "+num);
            }else if(num<randint){
                System.out.println("Select a number greater than "+num);
            
            num=input.nextInt();
            }
        } 
        System.out.println("Your have found the number int your "+counter+" th chnace");
        }catch(InputMismatchException e){
            System.out.println("Input should be a number");
        }
        
    }
    
}