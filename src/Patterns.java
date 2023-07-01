import java.util.Scanner;

public class Patterns {

    //printSolidRectange
    public void printSolidRectange(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //printHollowRectange
    public void printHollowRectange(int n){

       for(int i=1;i<=n;i++){

           for(int j=1;j<=n;j++){

               if(i==1 || j==1 || i==n || j==n){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();

       }

    }

    //halfPyramid
    public void halfPyramid(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //revese Pyramid
    public void reversePyramid(int n) {

        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Inverted Half Pyramid
    public void invertedHalfPyramid(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //printPettern
    public void printPattern(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    //invertedHalfPattern
    public void invertedHalfPattern(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }


    //invertedHalfPattern
    public void floydTriangle(int n) {

        int counter=0;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(++counter+" ");
            }
            System.out.println();
        }

    }

    //invertedHalfPattern
    public void printBinaryTriangle(int n) {


        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }

    }

    //invertedHalfPattern
    public void butterflyPettern(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void solidRhondas(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void hallowsolidRhondas(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=5;j++){

                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }


    public void trianglePettern(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }

    }

    public void palindromePatter(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }

    public void drawDiamond(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n;i>=1;i--){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }





    public static void main(String[] args){

        int cout=1;

        Patterns p=new Patterns();

        do{
            Scanner scanner=new Scanner(System.in);

            System.out.println("Problems");
            System.out.println("1) Solid Rectangle\n2) hdlow Rectangle\n3)Half Pyramid\n4)Half Reverse Pyramid" +
                    "\n5)Half Inverted Pyramid\n6) print patter\n7)Inverted print Pattern" +
                    "\n8)floyd_Triangle" +
                    "\n9)printBinaryTriangle" +
                    "\n10)ButterFlyPetter" +
                    "\n11)solidRhondas" +
                    "\n12)hallowsolidRhondas" +
                    "\n13)trianglePatter" +
                    "\"\\n14)palindromicPattern" +
                    " \"\\\"\\\\n15)Diamond");

            System.out.println("Enter Your Choice:");
            int enteryourchoice=scanner.nextInt();

            System.out.println("Enter Size of the Pattern N :");
            int size=scanner.nextInt();

            switch(enteryourchoice){

                case 1:p.printSolidRectange(size);
                break;
                case 2:p.printHollowRectange(size);
                break;
                case 3:p.halfPyramid(size);
                break;
                case 4:p.reversePyramid(size);
                break;
                case 5:p.invertedHalfPyramid(size);
                break;
                case 6:p.printPattern(size);
                break;
                case 7:p.invertedHalfPattern(size);
                break;
                case 8:p.floydTriangle(size);
                break;
                case 9:p.printBinaryTriangle(size);
                break;
                case 10:p.butterflyPettern(size);
                break;
                case 11:p.solidRhondas(size);
                break;
                case 12:p.hallowsolidRhondas(size);
                break;
                case 13:p.trianglePettern(size);
                break;
                case 14:p.palindromePatter(size);
                break;
                case 15:p.drawDiamond(size);
                break;
            }


            System.out.println("Do you want to continue then Press 1:");
            cout=scanner.nextInt();

        }while(cout==1);

    }


}
