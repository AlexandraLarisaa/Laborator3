package lab_mta.selab;

public class myThread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(28 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
