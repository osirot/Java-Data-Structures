import java.io.*; 
import java.util.*; 
/** Olga Sirotinsky
   Asg 6 
   Using Double linked list class created in DubLinkedList file, 
   1)Read through a file containing integers. 
   2)Add each int to double linked list. 
   3)Add another number not included in the integer file to the begining of list, middle, and end. 
   4)Using the double linked list created find the highest number, lowest number, and average. 
   5) Print the list along with the min, max and average. 
   *note: numbers will not be sorted*
*/


public class DoubleLLprogram {        
                       

   public static void main(String args[]){  
   
       try{
         DubLinkedList dList = new DubLinkedList(); 
                           
        Scanner input = new Scanner(new File("llnums.txt"));    
        
        while(input.hasNext()){
            if(input.hasNextInt()){//only do directions below if there are next ints in file
               int num = input.nextInt(); //get first integer
               
               dList.add(num); //create front of linked list
                
             }else{ input.next();//skip to next in file  
             }//end if-else                                                  
         } //end loop 
         
         int size = dList.size(); 
         //System.out.println(size);
                  
         //Print list 
         System.out.println("DDlist before beginning/middle/end added numbers"); 
         dList.LLprint(); 
         //dList.printBack();//used to test prev links 
                  
         //add a to front 
         int a = 2345; 
         dList.add(0, a);
         //dList.LLprint();//test print
         
         //add b to middle of list
         int b = 6789; 
         dList.add((size/2), b);
         //dList.LLprint();//test print
         //System.out.println(size); 
         
         //add c to end of list
         int c = 1357; 
         dList.add(c);
         System.out.println("\nDDlist after beginning/middle/end added numbers"); 
         dList.LLprint();
         //dList.printBack();//used to test prev links
         
         //print/find average , min, max
         System.out.println("\nAverage = " + dList.findAverage());
         System.out.println("Min = " + dList.findMin()); 
         System.out.println("Max = " + dList.findMax());

   } 
   catch(FileNotFoundException e){
      System.err.println("FileNotFoundException: "+ e.getMessage());
   }   
         
         
    }//end main 
      
             
}//end DoubleLLprogram class