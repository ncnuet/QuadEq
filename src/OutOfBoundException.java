public class OutOfBoundException extends Exception{
    public OutOfBoundException(String message){
        super(message);
    }

    public OutOfBoundException(){
        super("Out of bound");
    }
}
