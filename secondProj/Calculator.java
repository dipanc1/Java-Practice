package folder.folder1.folder2;

class Button {
    void btn() {
        System.out.println("Button created");
    }

    protected void click() {
        System.out.println("Button clicked");
    }
}

class Number extends Button {

}


public class Calculator {
    public static void main(String[] args) {
        Number n = new Number();

        n.click();
        n.btn();
    }
}
