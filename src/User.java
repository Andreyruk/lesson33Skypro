public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        if (login.equalsIgnoreCase(email)) throw new IllegalStateException("Логин и емайл равны");
            this.login = login;
//        if (this.checkEmail(email)) this.email=email;
//        else throw new RuntimeException("11111");
            this.email = this.checkEmail(email) ? email : "";


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = this.checkEmail(email) ? email : "";
    }

    private boolean checkEmail(String email) {
        if (email.contains("@") && email.contains(".")) return true;
        else throw new RuntimeException("Неверный email");
        //return email.contains("@") && email.contains(".");
    }
}
