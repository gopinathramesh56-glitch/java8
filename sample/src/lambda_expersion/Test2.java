package lambda_expersion;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Contract2 cc=  ()-> {System.out.println("tryu");};
//		cc.rule2();
//		
//		Contract2 bb= (a,b)->{System.out.println("gfh "+(a+b));};
//        bb.add(10, 20);
		 Contract2 vv = (no1, no2) -> {
	            return no1 + no2;
	        };

	        System.out.println(vv.add(100, 200));
	    }
	}