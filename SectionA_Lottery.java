package ctulessons.wswd412_fa1;

// imports
import java.util.Random;

import java.util.Scanner; //user input import


public class SectionA_Lottery 
{
     //Main method
    public static void main(String[] args)
    {
        
        //User numbers
        Scanner Input = new Scanner(System.in);  // creating the input object
        System.out.println("Please enter your first number:");
        String Num1 = Input.nextLine();
        
        System.out.println("Please enter your second number:");
        String Num2 = Input.nextLine();
        
        System.out.println("Please enter your third number:");
        String Num3 = Input.nextLine();
        
        System.out.println("Please enter your fourth number:");
        String Num4 = Input.nextLine();
        
        System.out.println("Please enter your fith number:");
        String Num5 = Input.nextLine();
        
        System.out.println("Please enter your sixth number:");
        String Num6 = Input.nextLine();
        
        System.out.println("==============================");
        System.out.println("User generated numbers:");
       
         System.out.println(Num1 + " "+Num2 + " "+Num3 + " "+Num4 + " "+Num5 + " "+Num6 + " ");
         System.out.println("==============================");
        
        //Generate numbers
        Random Numbers = new Random();
        System.out.println("==============================");
        System.out.println("Computer genertated numbers");
        
        for(int i=0; i<6; i++)
        {
            int Randomnumber = Numbers.nextInt(60);
           
            System.out.print(Randomnumber + " ");
           
        }
    }
}
