import java.util.Scanner;
public class mathclassbrocode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x = 3.14;
        double y = -10;
        
        double max = Math.max(x, y);
        
        System.out.println(max);
        
        double abs = Math.abs(x);
        System.out.println(abs);
        
        // theres math.max math.min math.abs math,sqrt math.round 
        // math.ceil always rounds the number up
        // math.floor always rounds down
        
        // ok so im freestyling and tryna write pythagoros code myself
      /*double a;
       *double b;
       *double c;
        
       *Scanner scanner = new Scanner(System.in);
        
       *System.out.println("Enter the side a: ");
       *a = scanner.nextDouble();
       *System.out.println("Enter the side b: ");
       *b = scanner.nextDouble();
        
        
       *double z = (a*a)+(b*b);
       *c = Math.sqrt(z);
       *System.out.println(c);
       */ 
        		// my code only works for side a and b but if you dont know either a or b then it wont work. and its useless knowing c 
        // this is the version that works below 
        
        double a;
        double b;
        double c;
         
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter the side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the side b: ");
        b = scanner.nextDouble();
        
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("the hypotonuse is "+c);
        
        scanner.close();
        
        
        		
        
	}

}
