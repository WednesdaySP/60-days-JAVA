public class Performance{
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series+=ch;
        }
        System.out.println(series);
        //space complecxity, time complex: O(N^2)
        //therefore not a good approch to use String as it is immutable and for each iteration new object is created which has no pointing reference variable to it
        // in this way huge memory is wasted.

        //Its soln is to use a datatype which allows us to modifiy its values 
        //i.e StringBuilder: mutable
    }
}