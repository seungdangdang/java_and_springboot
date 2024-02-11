package part3.proxy;

public class Test {

    public static void main(String[] args) {

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

    }
}