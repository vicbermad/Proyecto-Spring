package es.musica.musica.exception;

public class CustomException extends Exception{
    private ErrorCode errorCode;

    public CustomException(ErrorCode errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }
    public String getMessageError(){
        return errorCode + ": " + getMessage();
    }
}
