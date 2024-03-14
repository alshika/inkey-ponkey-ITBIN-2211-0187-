public class Inkey{
	public Inkey(String x){
		System.out.println(x);	
	}
	public Inkey(String pinkey,String blinkey,String rinkey){
	System.out.println(blinkey+""+pinkey);	
	System.out.println(pinkey+""+rinkey);
	System.out.println(blinkey+""+pinkey+""+rinkey);
	}
	public static void main(String[] args ){
    String pinkey = "donkey";	
	Inkey ponkey = new Inkey(pinkey);//obj 1 creation
	 
	 
	 String blinkey = "pinkey";
	 String rinkey = "monkey";
	 Inkey ponkey2 =new Inkey(pinkey,blinkey,rinkey);//obj 2 creation
	}
	}