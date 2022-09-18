public class UserException extends Exception{
    enum ExceptionType{
        YOu_ENTERED_INVALID_DATA,ENTERED_EMPTY;
    }
    ExceptionType type;
    public UserException(ExceptionType type,String firstName) {
        super(firstName);
        this.type=type;
    }
}
