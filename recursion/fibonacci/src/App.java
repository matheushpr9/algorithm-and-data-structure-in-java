import recursion.Fibonacci;

public class App {
    public static void main(String[] args) throws Exception {
        
        Fibonacci fibonacciController = new Fibonacci();

        double fibonacciResult = fibonacciController.recursiveFibonacci(4);

        System.out.println(fibonacciResult);
    }
}
