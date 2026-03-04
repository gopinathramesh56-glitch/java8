package Lamda_learnings;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {

        // anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I just implemented the Runnable Functional Interface.");
            }
        }).start();
    }
}


// Implement SAM with anonymous classes in java