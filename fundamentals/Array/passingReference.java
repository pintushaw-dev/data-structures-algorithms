package Array;
// in java only pass by value not reference

public class passingReference {
    static  void printArray(int []arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr=new int[5];
        arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;
        System.out.println("original array");
        printArray(arr);
        int []arr_2=arr;
        System.out.println("copied arr_2");
        printArray(arr_2);
        arr_2[0]=6;arr_2[1]=7;
        System.out.println("original array after changing arr_2");
        printArray(arr);
        System.out.println("copied array after changing arr_2");
        printArray(arr_2);


    }
}
