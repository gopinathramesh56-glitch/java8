package Lamda_learnings;


public class Test {

    public static void main(String[] args) {
        
        Contract cc = () -> {
            System.out.println("hi");
        };   
        
        cc.rule();   
    }
}
