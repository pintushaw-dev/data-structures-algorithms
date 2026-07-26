public class KthMissingInSorted {
    public int kthMissing(int[] arr, int k) {
        int result = arr.length + k;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > mid + k) {
                result = mid + k;
                high = mid - 1;
            } else low = mid + 1;
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 11};
        int k=5;
        KthMissingInSorted obj=new KthMissingInSorted();
        System.out.println(obj.kthMissing(arr,k));

    }
}
