import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int sum = a + b;
        System.out.println("sum="+sum);

        if(sum%2!=0){
            System.out.println("this is odd");
        }
        else if(sum==0) {
            System.out.println("This is 0");
        }
        else{
            System.out.println("this is even");
        }

        switch(sum){

            case 2:System.out.println("It is two");
            break;
            default:System.out.println("print me");
        }

        int temp=0,s=0;

        do{
            temp++;
            System.out.println("2 * "+temp+"*"+temp*2);

        }while(temp<a);

        System.out.println(s);



    }
}
