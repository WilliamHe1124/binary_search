public class Binary_Search
{
    static int binarySearch(int[] arr, int x, int lowest, int highest){
        while (lowest<= highest){
            int guess=lowest+(highest-lowest)/2;
            if (arr[guess]==x) return guess;
            else if (arr[guess]>x) return binarySearch(arr, x, lowest, guess-1);
            else return binarySearch(arr, x, guess+1, highest);
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] arr={ 1, 2, 3, 4, 5};
        int x=4;
        int result=binarySearch(arr, x, 0, arr.length);
        if (result==-1){
            System.out.println("Result not found");
        } else {
            System.out.println("The index of the element is "+result);
        }
    }
}
