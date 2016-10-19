
import java.util.Scanner;

public class SumOfMultiples {
	public static void main (String[] args){
		int i,n;
		long sum=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (i=1;i<n;i++){
			if (i%3==0 || i%5==0){
				sum +=i;
			}
		}
		System.out.println(sum);
	}

}
