public class SearchInStrings {
    public static void main(String[] args) {
        String str="Shashi";
        char target='a';
        System.out.println(search(str,target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    //for each loop
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
