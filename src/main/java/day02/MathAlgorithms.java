package day02;

public class MathAlgorithms {

    public static void main(String[] args) {
        MathAlgorithms m=new MathAlgorithms();
        System.out.println(m.greatestCommonDivisor(99,66));
    }
    public int greatestCommonDivisor(int a,int b){
        for(int result=(int) (Math.min(a,b)*0.5);result>0;result--)
            if(a%result+b%result==0)  return result;
        return 0;
    }
    public int greatestCommonDivisorWhile(int firstNumber, int secondNumber){

        while(firstNumber!=secondNumber){
            if(firstNumber>secondNumber){
                firstNumber-=secondNumber;
            }else{
                secondNumber-=firstNumber;
            }
        }

        return firstNumber;
    }
}