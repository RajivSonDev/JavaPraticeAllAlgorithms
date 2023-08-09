
// Trying to be efficient programmer not just a programmer

import Modal.Calculator;

public class Main {
    public static void main(String[] args) {

        int result=1;
        result=(result==10)?20:50;
        System.out.println("Hello World value of result = "+result);

        Calculator cal=new Calculator();   // we don't call cal as object here it is in c++, it is called ref
        // reference variable
        int temp=cal.add(1,3);
        System.out.println(String.valueOf(temp));

        temp=cal.add(1,3,4);
        System.out.println(String.valueOf(temp));
    }
}
