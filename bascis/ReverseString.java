import java.util.ArrayList;

class ReverseString 

{
    public static void main(String[] args)
    {
        //create array list of integer type
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list.sort();
        String str = "Hel";
        System.out.println(str+"\n Reverse: ");
        // System.out.print(str.length());
        
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }

}