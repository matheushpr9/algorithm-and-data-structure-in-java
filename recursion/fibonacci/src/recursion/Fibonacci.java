package recursion;

public class Fibonacci{
    public double recursiveFibonacci(int number){
        
        if(number == 1){
            return number;
        }

        return number+recursiveFibonacci(number -1);

    }
}