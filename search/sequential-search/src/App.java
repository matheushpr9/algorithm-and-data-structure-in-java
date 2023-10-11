import sequential_search.Search;

public class App {
    public static void main(String[] args) throws Exception {
        
        int array[] =  new int[5];
        
        for(int i = 0; i<array.length; i++){
            array[i] = i+1;
        }

        Search searcher = new Search();
        
        boolean numberIsIn = searcher.sequentialSearch(array, 10);

        System.out.println(numberIsIn);
    }
}
