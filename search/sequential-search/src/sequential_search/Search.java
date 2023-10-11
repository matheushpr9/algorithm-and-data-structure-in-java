package sequential_search;

public class Search{
    public boolean sequentialSearch(int[] array, int wantedNumber){
        for(int number : array){
            if(number == wantedNumber){
                return true;
            }
        }
        return false;
    }
}