public class Data {

    public static void checkException(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

            int i;
            for (i = 0; i < login.length(); i++) {
                if (!Character.UnicodeBlock.of(login.charAt(i)).equals(Character.UnicodeBlock.BASIC_LATIN) ||
                        login.charAt(i) == '-')  {
                    throw new WrongLoginException("проверить логин", login);
                }

            }
            if
            (!(login.length() <= 20) || login == null) {
                throw new WrongLoginException(login);
            }


            for ( i = 0; i < password.length(); i++) {
                if (!password.equals(confirmPassword) || !Character.UnicodeBlock.of(password.charAt(i)).equals(Character.UnicodeBlock.BASIC_LATIN)) {

                    throw new WrongPasswordException("проверить пароль", password, confirmPassword);
                }

            }
            if (password == null){
                throw new WrongPasswordException("пустое поле",password,confirmPassword);
            }
        }
    }



