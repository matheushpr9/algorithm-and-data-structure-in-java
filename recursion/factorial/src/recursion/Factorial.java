package recursion;

public class Factorial{
    public double recursiveFactorial(int number){
        if(number ==1 ){
            return 1;
        }

        return(number * recursiveFactorial(number-1));

    }
}