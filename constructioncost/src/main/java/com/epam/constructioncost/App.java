package com.epam.constructioncost;
import java.util.*;
import Cost_of_construction.*;



public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
        System.out.printf( "Please choose the standard of material you want from the below options " );
        System.out.printf("\n1) STANDARD MATERIALS- 1200INR per sq.ft\n2) ABOVE STANDARD MATERIALS - 1500INR per sq.ft\n3) HIGH STANDARD MATERIALS - - 1800INR per sq.ft \n4) HIGH STANDARD MATERIALS AND FULLY AUTOMATED HOME - 2500INR per sq.ft\n");
        
        int choosedoption=scanner.nextInt();
        float area=0;
        if(choosedoption>0 && choosedoption<=4) {
        System.out.printf("Enter the total area of house in sq.ft:");
         area=scanner.nextInt();
        }
        
        float totalcost=0;
        boolean flag=false;
        switch(choosedoption)
        {
        
        case 1: totalcost=ConstructionCost.getConstructionCost(1200,area);
                break;
               
        case 2: totalcost=ConstructionCost.getConstructionCost(1500,area);
                break;
                
        case 3: totalcost=ConstructionCost.getConstructionCost(1800,area);
                break;
                
        case 4: totalcost=ConstructionCost.getConstructionCost(2500,area);
                break;
                 
        default :System.out.printf("You have entered an invalid option ");
                 flag=true;
                 break;
        
        
        
        
        }
        
        if(!flag)
        {
        System.out.printf("The Estimated cost for construction of house  is %f ",totalcost);
        }
        
    }
}
