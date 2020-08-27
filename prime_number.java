import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=s.nextByte();
        prime k= new prime();
        k.check_prime(n);   
        k.Print_Prime(n);
    }
    void check_prime(int n ){
        int c =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c=c+1;                
            }
        }
        if(c==2)
            System.out.println("Given is a prime number ");
        else
            System.out.println("Given is not a prime number\n ");
        
        
    }
    int Print_Prime(int m){
        System.out.println("The prime numbers upto "+m+" are : ");
        for(int i=0;i<=m;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c=c+1;
            }
            if(c==2)
                System.out.println(i);
        }
        return 0;
    }
    
}








#OUTPUT:   
Enter a number : 
6
Given is not a prime number
 
The prime numbers upto 6 are : 
2
3
5
