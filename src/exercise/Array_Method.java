package exercise;

import java.util.Arrays;

public class Array_Method {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};

        //array using to string
        //System.out.println(Arrays.toString(numbers));


        String [] cars={"Lexus","Toyota","Suzuki","Malibu","Souleaast"};

    //    boolean b=Arrays.asList(cars).contains("Malibu");
   //     System.out.println(b);

        String [ ]copycars=new String[3];
        System.arraycopy(cars,1,copycars,0,3);

        System.out.println(Arrays.toString(copycars));
    }
}
