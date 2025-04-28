package Testsimple;

public class primeNumber {

	public static void main(String[] args) {
		// 10. Check given number is Prime or not

				int primeNumber = 7;
				int countNumber = 0;
				for (int i = 1; i <= primeNumber; i++) {
					if (primeNumber % i == 0) {
						countNumber++;
					}
				}
				if (countNumber == 2) {
					System.out.println("The given number is prime number");
				} else {
					System.out.println("The given number is not prime number");
				}

	            int num =100;
		   		for (int i=1; i<=num; i++){	
				 int count=0;
			    for(int j=1; j<=i; j++){
			        if (i%j==0){
			        count++;
			    }
			    }if(count==2)
			        System.out.print(i + " ");
			}
			
	}

}
