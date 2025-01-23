package polymorphism;

import java.net.StandardSocketOptions;

public class Calculation {

    // compile time polymorphism
    public int add(int a, int b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }


    public static void main(String [] args){
        Calculation calculation = new Calculation();
//        int result= calculation.add(10,20,30);
        float result = calculation.add(10.0f, 15.5f);
        System.out.println(result);



    }


}
