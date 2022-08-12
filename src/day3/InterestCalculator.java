package day3;

public class InterestCalculator {


    public static void main(String[] args) {

          float P = 1000.50f;
          int T = 2;
          float R = 2.5f;

          System.out.println(interestCalc(P,T,R));



    }


    public static float interestCalc(float a, int b, float c)
    {
        float x = (a * b * c) / 100;
        return x;

    }
}
