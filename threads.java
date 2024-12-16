public class Main {
    static class BMSDisplayThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("BMS College of Engineering");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class CSEDisplayThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("CSE");
                try {
                    Thread.sleep(2000); // sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread bmsThread = new BMSDisplayThread();
        Thread cseThread = new CSEDisplayThread();
        bmsThread.start();
        cseThread.start();
    }
}
