
package testemp;

public class TestEmp {

    public static void main(String[] args) {
        
        int number[]={10,20,70,40,50};
        
        minValueInArray(number);
        
        int sortedNumber[]=sortArray(number);
        System.out.println("Sorted Array: ");
        for(int i=0;i<sortedNumber.length;i++){
            System.out.println(sortedNumber[i]);
        }
    }
    static void minValueInArray(int arr[]){
        
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
            
    static int[] sortArray(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
