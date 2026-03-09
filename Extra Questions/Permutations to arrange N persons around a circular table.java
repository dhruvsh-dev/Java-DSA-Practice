import java.io.*;

class Solution
{
    static int Circular(int n) 
    { 
        int Result = 1; 

        while (n > 0) 
        { 
            Result = Result * n; 
            n--; 
        } 

        return Result; 
    } 

    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(Circular(n - 1));
    }
}
