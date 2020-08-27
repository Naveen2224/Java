import java.util.Scanner;
public class Fibanocci {
    public static void main(String[] args){
        int n ;
        int a=0,b=1,c;
        System.out.println("enter the no : ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n<=0)
            System.out.println("Fibanoccci is not possible");
        else if(n==1)
            System.out.println("Fibanocci series is : "+a);
        else{
            System.out.println("the fibanocci series is : ");
            System.out.print(a+" "+b);
            for(int i=2;i<n;i++){
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
    }
}





#OUTPUT: 
enter the no : 
10
the fibanocci series is : 
0 1 1 2 3 5 8 13 21 34
