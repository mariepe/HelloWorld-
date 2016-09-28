
public class Primzahlen {
	
	static int number = 0;
		static	int i;

	public static void main(String[] args) {
		int ausgabe=0;
	System.out.println("Primzahlen");
	
	for(int i=number; i<= 10000; i++);{
		number=i;
	if(isPrime(number)==true){
	System.out.print(number + ", ");
	ausgabe++;
	
	if(ausgabe%30==0){
		System.out.println("");
		ausgabe=0;
	}
	}
	}
	}
 
	public static boolean isPrime(int number){
		
		if(number<2){return false;}
		
		for(int i=2; i<=number/2; i++){
				if(number%i==0){
						return false;}
				}
		return true;
		}
	}