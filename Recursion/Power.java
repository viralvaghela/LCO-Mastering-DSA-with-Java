public class Power { 

    public static void main(String[] args) {
        int base =2;
        int exp = 3;
        int ans = power(base,exp);
        System.out.println(ans);
    }
    public static int power(int base , int exp )
    {
        if(exp != 0)
        {
            return (base * power(base,exp-1));
        }
        else 
            return 1;
        
    }
    
}