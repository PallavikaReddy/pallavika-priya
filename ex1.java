public class ex1 {
    public static void main(String[] args) {
        String str=null;
        int arr[]={1,2,3,4};
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("its a nullpointer exception"+e);
        }
        try
        {
           System.out.println(arr[4]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("exception out of bound"+e);
        }
        finally
        {
            System.out.println("done execution");
        }
    }
}
