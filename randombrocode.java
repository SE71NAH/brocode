import java.util.Random;
public class randombrocode {
// note that computers always start with 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random random = new Random(); // new Random(); creates new object where u can use its methods such as nextInt() or nextDouble() to generate random numbers
	    
        int x = random.nextInt(); //.nextInt is used to read the next input from the user
   //   double y = random.nextDouble();
    //  boolean z = random.nextBoolean();
        
     // int c = random.nextInt(6); // this will generate a random number between 0 and 5
    //  int g = random.nextInt(6)+1; // this will generate a random number between 0 and 6
        System.out.println(x);
        
	
	
	}

}
