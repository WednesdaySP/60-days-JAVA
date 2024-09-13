public class Scope {
    public static void main(String[] args) {
        int a=20; 
        int b=20;
        {
            a=100; //reassign the orignal ref variable to some other value
            //this cange will be visible outsode the block also
            System.out.println(a);
            int c=45; //values insilized in the block will remain inside the block only
            //int a=30;//variable inisilized outside the block cannot be re inislized inside the block, only their values can be changed.

        }
        int c=30; 
        System.out.println(a);
        //System.out.println(c); //cannot use outside the block
    }
}
