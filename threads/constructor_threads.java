
class JattThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Run Method...");
    }
}

public class constructor_threads {
    public static void main(String[] args) {
        JattThread jt = new JattThread();
        Thread at = new Thread(jt, "Jatt");

        at.start();
        at.setName("Jatti");
        System.out.println(at.getId());
        System.out.println(at.getName());


    }
}
