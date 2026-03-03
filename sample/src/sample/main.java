package sample;

interface Playable {
    void play();
}

 class Guitar implements Playable{

	@Override
	public void play() {
		System.out.println("play guitar");
	}
	 
 }
 
 class Piano implements Playable{

	@Override
	public void play() {
		System.out.println("play piano");
	
		
	}
	 
 }
public class main {
    public static void main(String[] args) {
    	Guitar G1= new Guitar();
    	G1.play();
    	Piano P1= new Piano();
    	P1.play();

     
    }
}
