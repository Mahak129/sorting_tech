public class insertion{
public static void print(int arr[]) {
    for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
    public static void insertion(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i - 1;
            //finding out the correct pos to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void main(String args[]){
        int arr[]= {3,6,1,2,4};
     insertion(arr);
     print(arr);
    }

}