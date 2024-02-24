import java.util.*;

class Program507
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();             // To convert string into array
        int i = 0;
        int SpaceCnt = 0;

        for(i = 0; i < Arr.length; i++)         // Property
        {
            if(Arr[i] == ' ')
            {
                SpaceCnt++;
            }
        }
        System.out.println("Number of words are : "+(SpaceCnt+1));
    }
}