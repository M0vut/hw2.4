
public class Main {

    public static void main(String[] args) {


    String login = "kл";
    String password = "88888";
    String confirmPassword = "8888";
    try {
        Data.checkException(login, password, confirmPassword);
        System.out.println("все работает");
    }catch (WrongPasswordException e){
        System.out.println( e.getMessage());
    }catch (WrongLoginException e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("Ввод логина и пароля");
    }
}
    }
