package LectureQuestions;
// public class MaxProduct {
    

//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//     int n = arr.length;
//     int max=Integer.MIN_VALUE;

//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int product=arr[i]* arr[j];
//                 if(product>max){
//                     max=product;

//                 }
//             }

//         }
//         //time complexity: O(n*2)
//         System.err.println(max);

//     }
    
// }


//chatgpt solution using forEach
// import java.util.Arrays;

// public class MaxProduct {
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};
        
//         // Variables to hold the max values need to be final or effectively final to be used inside lambda
//         final int[] firstMax = {Integer.MIN_VALUE};
//         final int[] secondMax = {Integer.MIN_VALUE};

//         Arrays.stream(arr).forEach(value -> {
//             if (value > firstMax[0]) {
//                 secondMax[0] = firstMax[0];
//                 firstMax[0] = value;
//             } else if (value > secondMax[0]) {
//                 secondMax[0] = value;
//             }
//         });

//         // Calculate the maximum product
//         int maxProduct = firstMax[0] * secondMax[0];

//         System.out.println(maxProduct);
//     }
// }



public class MaxProduct {
    

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
    int n = arr.length;
    int max=Integer.MIN_VALUE;
    int last=n-1;

        for(int i=0;i<n;i++){
           if(n*last==20){
            System.out.println(last);
            System.out.println(n);
           }

        }
        //time complexity: O(n*2)
        System.err.println(max);

    }
    
}