public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,3,2,6,1,4};
        System.out.println(uniqueNumber(arr));
    }
    static int uniqueNumber(int[] arr){
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
    }
}
