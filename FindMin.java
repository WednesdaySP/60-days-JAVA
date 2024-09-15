public class FindMin {
    public static void main(String[] args) {
        int [] arr={2,0,-45,34,45,65,73,56};
        System.out.println(min(arr));
    }
    static int min(int [] arr){
        if(arr.length==0){
            return -1;
        }
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                return arr[i];
            }
        }
        return -1;

    }
}
