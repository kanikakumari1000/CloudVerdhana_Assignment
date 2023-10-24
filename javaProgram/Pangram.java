import java.util.*;

public class Pangram
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      int count = 0;

      System.out.print("enter a string : "); 
      String str = sc.nextLine();   //a Quick brown fox jumps over the lazy dog

      int length = str.length();

      for(char ch='a';ch<='z';ch++)
      {
         for(int i=0;i<length;i++)
         {
            if(ch == str.charAt(i) || ch == String.valueOf(str.charAt(i)).toLowerCase().charAt(0))
            {
               count++;
               break;
            }
         }
      }

      if(count == 26) {
        System.out.println("string is a pangram");
      }else {
        System.out.println("string is not a pangram");
      }
   }
}