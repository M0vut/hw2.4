public class WrongLoginException extends Exception  {
    String login;

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "login='" + login + '\'' +
                "} " + super.toString();
    }

    public WrongLoginException(String login) {
        this.login = login;
    }

    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public WrongLoginException(String message, Throwable cause, String login) {
        super(message, cause);
        this.login = login;
    }

    public WrongLoginException(Throwable cause, String login) {
        super(cause);
        this.login = login;
    }

    public WrongLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String login) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.login = login;
    }
}
