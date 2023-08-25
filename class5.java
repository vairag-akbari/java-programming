import java.util.Scanner;

public class class5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int law = sc.nextInt();
        int high = sc.nextInt();

        for(int n = law; n<=high;n++){
            int count = 0;
            
            //try to divide n and increase count
            for(int div = 2;div*div<=n;div++){
                if(n%div == 0){
                    count++;
                    break;
                }
            }  

            if(count == 0){
                System.out.println("prime number between " + law + " and " + high + " is " + n );
            }
        }
    }
}
