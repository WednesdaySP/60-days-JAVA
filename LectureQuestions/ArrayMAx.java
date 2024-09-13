package LectureQuestions;

public class ArrayMAx {
    public static void main(String[] args) {
       
        int[] arr={2,5,34,65,8};
        
       
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 2));
    }
    static int max(int[] arr){
        if(arr ==null){
            return -1;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
        
            }
        }
        return max;
    }
    static int maxRange(int[] arr, int start, int end){
        if(arr ==null){
            return -1;
        }
        if(end>start){
            return -1;
        }
        int max=arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
        
            }
        }
        return max;
    }
}
