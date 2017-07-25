import java.util.*;
import java.io.*; 

/**
Olga Sirotinsky
AD 300 asg 7

Write a program that 
1)reads a file of 15 unsorted integers and 
2)loads them into a sorted binary tree so that transversing the b-tree in an in-order 
transversal the integers will be retrieved in sorted order.   */

public class BTProgram{
   public static void main(String args[]){       
      
      try{
         BinaryTree intTree = new BinaryTree();
         Scanner input = new Scanner(new File("nums.txt")); 
         while(input.hasNext()){
            if(input.hasNextInt()){//only do directions below if there are next ints in file
               int num = input.nextInt(); //get first integer
                  intTree.add(num); 
            }//end if case
         }//end loop
        
         intTree.print(); //print in order
         
         
      } //end try
      
      catch(FileNotFoundException e) {
         System.err.println("FileNotFoundException: "+ e.getMessage());
      }//end catch

      
   }//end main
}//end BTProgram class