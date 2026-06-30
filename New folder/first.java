class TarunException extends Exception{
    TarunException(String message){
        super(message);
    }
}
public class first {
    static void checkage(int age) throws TarunException{
        if(age<18){
            throw new TarunException("Age must be greater than 18");
        }else{
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String [] args){
        try{
            checkage(17);
        }catch(TarunException e){
            System.out.println(e.getMessage());
        }
    }
}