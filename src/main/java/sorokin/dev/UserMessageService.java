package sorokin.dev;

public class UserMessageService {

    public String createMessage(String name) {
        return "Привет, {" + name + "}, добро пожаловать!";
    }
}
