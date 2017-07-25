
import java.util.*;
 
/** Olga Sirotinsky
   Asg 6 ad 300,  2017
   Single linked list class used along with llprogram which runs the linked list in main. 
   This class builds a linked list using nodes and integers. 
   */


public class LinkedList {
        
       private Node front; 
       private int size; 
        
   //constructor
   public LinkedList(){                          
          front= null; 
          size = 0;                
   }                   
           
    
    public int size(){
         return size; 
    } 
    
    public boolean isEmpty(){
      return front==null; 
    }
    
        
    public void add(int data){
         if(front == null){
            front = new Node(data); 
         }else{
            Node curr = front; //cursor 
            while(curr.next!= null){//parse through to end of node list
               curr = curr.next;//set cursor to last node before adding new node
            } //end loop
            curr.next = new Node(data); //create new node at end of list   
          }//end if else  
          size++;       
    }//end add()
    
    
    //adds values at specified position
    public void add(int pos, int val){
         if(pos < 0 || pos > size)throw new IllegalArgumentException();
         if(front == null) front = new Node(val); //create list if null
         if(pos == 0 && front != null) { //add to beginning of list
            Node temp = new Node(val); 
            temp.next = front; 
            front = temp; 
         } else{//find node right before position and add it to position 
            Node curr = front; 
            for(int i = 0; i < pos; i++){
                  curr= curr.next;             
            }
            curr.next = new Node(val); 
         }//end if- else
    }//end add
    
    
    /**
    finds biggest int 
    @return the highest int
    @return -1000000 if list is empty*/
    public int findMax(){
         Node curr = front;
         if(curr != null){
            int max = curr.data; 
            while(curr.next != null){
            curr= curr.next;
               if(max < curr.data){
                  max = curr.data; 
               }
           }//end loop
        return max;
         }else{ 
            return -1000000; }//only return this number if list is null     
    }//end findMax
    
    
    /**
    finds smallest int 
    @return the smallest int
    @return -1000000 if list is empty*/
     public int findMin(){
        Node curr = front;
        if(curr != null){
            int min = curr.data;
            while( curr.next != null){
               curr = curr.next; 
               if(min > curr.data){
               min = curr.data; 
               }               
            }//end loop
         return min; 
        }else{ 
         return -1000000; }//only return this number if list is null  
    }//end findMin
    
    
    /**
    finds average of ints in list 
    @return the average calculated
    @return -1000000 if list is empty*/
    public int findAverage(){
      Node curr = front; 
      if(curr != null){
         int average = curr.data; 
         while(curr.next != null){
            curr = curr.next;
            average += curr.data;              
         }//end  loop
         return average;
      }else{ 
         return -1000000; }//only return this number if list is null        
    } //end findAverage 
      
         
   /**
   print the list by using a loop and print statements
   */
   public void LLprint(){
      Node curr2 = front; //cursor to traverse list and print
         if(curr2 != null){
            System.out.print("[ " + curr2.data);            
            while(curr2.next != null){
               curr2= curr2.next; 
               System.out.print(", " + curr2.data); 
            }//end while loop
            System.out.println("]");
         }else{System.out.println("[]");}//end if else     
   }//end LLprint




      /**private Node class with constructor to use in above linked list class of creating 
      LL of ints*/
      private class Node{
         public int data;
         public Node next;       
         
         public  Node(int data){
            this.data = data; 
            this.next = null;             
          }//end constructor
             
      }//end node class
      
             
}//end LL clas