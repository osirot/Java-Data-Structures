import java.io.*; 
import java.util.*; 
/** Olga Sirotinsky
   Asg 6 
  A program that reads a file containing integers. if there are ints, load 
  integers into a linked list. Print entire linked list. Traverse LL to find
  a)largest#, b)smallest#, c)average of all numbers, print a, b, c.
   */


public class LLprogram {
        
               

   public static void main(String args[])throws FileNotFoundException{     
            
        LinkedList list = new LinkedList(); //create instance of linked list class                            
                          
        Scanner input = new Scanner(new File("llnums.txt"));    
        
        while(input.hasNext()){
            if(input.hasNextInt()){//only do directions below if there are next ints in file
               int num = input.nextInt(); //get first integer
                    list.add(num);         
            }else{ input.next();//skip to next item in file
             }//end if-else                                                  
         } //end loop          
         
                 
         //Print list, average , min, max
         list.LLprint(); 
         System.out.println("Average = " + list.findAverage());
         System.out.println("Min = " + list.findMin()); 
         System.out.println("Max = " + list.findMax());
          
    }//end main      
             
}//end LLprogram class