package com.epam.assignment4_1;
import simpleinterest.*;
import java.util.*;

import compundinterest.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Press 1 for Simple_Interest\n 2 for CompoundInterest:");
        int choosedoption=scanner.nextInt();
        System.out.printf("Enter the Amount");
        int amount=scanner.nextInt();
        System.out.println("Enter the Period or Time of interest in Years:");
        float timeperiod=scanner.nextFloat();

        System.out.println("Enter the Rate of Interest per annum:");
        float rateperannum=scanner.nextFloat();
        
        
        switch(choosedoption)
        {
        
        case 1: float simple_interest=SimpleInterest.calculatesimpleinterst(amount, timeperiod, rateperannum);
                System.out.printf("The simple interest for given amount is %f",simple_interest);
                break;
                
                
        case 2: float compound_interest=CompoundInterest.CalculateCompoundInterest(amount, timeperiod, rateperannum);
        		System.out.printf("The coumpound interest for given amount is %f",compound_interest);
        		break;
        
        	     
        default: System.out.printf("Sorry you have entered an Invalid option");
                 break;
        
        }
        
    }
}
