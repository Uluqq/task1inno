package by.papkovich.task1.exception;

public class ArrayWrapperException extends Exception {
    public ArrayWrapperException(){
        super();
    }
    public ArrayWrapperException(String message){
        super(message);
    }
    public ArrayWrapperException(Throwable cause){
        super(cause);
    }
    public ArrayWrapperException(String message, Throwable cause){
        super(message, cause);
    }
}
