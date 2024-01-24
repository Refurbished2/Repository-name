import java.util.Random;

public class Main {
	public static Pixel pixel = new Pixel();
	public static Random random = new Random();
//funtion task is randomize strings of 101010s
	public static String randomize101(){
		String result = "yes";
		Integer num = random.nextInt(2);
		result = num.toString();
		return result;
	}
    public static void sleep(int time) {
	int newint = time;
		try{
        	Thread.sleep(newint);
		} catch(Exception e){}
    }




    public static void main(String[] args){
		while(true){
			//System.out.println("\033[32m"+String.join("and",args));
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(randomize101());
			System.out.print(" ");
			sleep(1);
			//System.out.println("superguy");
			
			// sleep(500);
		}
    }
        
}