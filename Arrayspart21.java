public class Arrayspart21 {
    // to print the frequency in the sorted order
    public static void Prinfreq(int arr[]){
        int n = arr.length;
        int freq = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1] == arr[i]){
                freq = freq + 1;
            }
            else{
                System.out.println("frequency of element " + arr[i-1] + " is " + freq);
                freq = 1;
            }
           
        }
        System.out.println("frequency of element " + arr[n-1] + " is " + freq);
    }

    public static void main(String [] args){
        int array[] = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };
        // int n = array.length;
        Prinfreq(array);        
    }
}
