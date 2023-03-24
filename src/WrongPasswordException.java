public class WrongPasswordException extends Exception {
    private String password;
    private String confirmPassword;

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                "} " + super.toString();
    }

    public WrongPasswordException(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public WrongPasswordException(String message, String password, String confirmPassword) {
        super(message);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public WrongPasswordException(String message, Throwable cause, String password, String confirmPassword) {
        super(message, cause);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public WrongPasswordException(Throwable cause, String password, String confirmPassword) {
        super(cause);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public WrongPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String password, String confirmPassword) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
