public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,};
        int target = 300;
        linearSearch(arr, target);
        System.out.println(linearSearch(arr, target));
    }
    static int linearSearch(int[] arr, int target ){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                return i;
                
            }
        }
        return -1;
    }


    //return element
    static int linearSearch1(int[] arr, int target ){
        if(arr.length==0){
            return -1;
        }

        for(int element : arr){
            if (element==target) {
                return element;
                
            }
        }
        return Integer.MAX_VALUE;
    }

    //return boolean true/false
    static boolean linearSearch3(int[] arr, int target ){
        if(arr.length==0){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                return true;
                
            }
        }
        return false;
    }
}
