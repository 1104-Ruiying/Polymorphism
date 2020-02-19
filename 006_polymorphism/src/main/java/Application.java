import java.net.PortUnreachableException;

public class Application {
    public static void main(String[] args) {
    Windows itellijIdea = new IntellijIdea();
    itellijIdea.pressF5();

    Windows chrome = new Chrome();
    chrome.pressF5();

    Windows wechat = new Wechat();
    wechat.pressF5();

    }
}
