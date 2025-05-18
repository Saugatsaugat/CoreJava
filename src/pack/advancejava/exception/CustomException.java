package pack.advancejava.exception;

class OwnException extends Exception {
    public OwnException(String msg){
        super(msg);
    }
}

public class CustomException {
    static void checkAge(int age) throws OwnException {
        if(age < 21){
            throw new OwnException("Age must be at least 21");
        }else{
            System.out.println("You can buy beers and cigarettes");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(19);
        }catch(OwnException e){
            System.out.println(e.getMessage());
        }
    }
}
