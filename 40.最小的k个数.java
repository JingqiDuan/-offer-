class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr == null || arr.length == 0 || k == 0){
            return new int[0];
        }
        quickSort(arr, 0, arr.length - 1);
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = arr[i];
        }
        return result;
    }

    private void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int left = start;
        int right = end;
        int pivot = arr[(start + end) / 2];//stay out
        while(left <= right){
            while(left <= right && arr[left] < pivot){
                left++;
            }
            while(left <= right && arr[right] > pivot){
                right--;
            }
            if(left <= right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        //left is == right + 1 when while loop beak
        //[start, right] [left, end]
        quickSort(arr, left, end);
        quickSort(arr, start, right);
    }
}
