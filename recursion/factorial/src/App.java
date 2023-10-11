import recursion.Factorial;

public class App {
    public static void main(String[] args) throws Exception {
        
        Factorial factorialController = new Factorial();
        double numberFactorial = factorialController.recursiveFactorial(20);

        System.out.println(numberFactorial);
    }
}
