
import java.util.*;
 
/** Olga Sirotinsky
   Asg 6 
   Double linked list class used with Dbllprogram class. 
   This class builds a doubly linked list using nodes and integers. 
   */


public class DubLinkedList {
        
       private Node front; 
       private Node end; 
       private int size; 
        
   //constructor
   public DubLinkedList(){                          
          front= null; 
          size = 0;                
   }                   
           
    
    public int size(){
         return size; 
    } 
    
    
    public boolean isEmpty(){
      return front==null; 
    }
    
        
    /**this method adds new nodes to the end of a linked list
      and adjusts the prev/next node links when a new node 
      is added to a list
    */
    public void add(int data){
         if(isEmpty()){
            front = end = new Node(data); 
         }else{
               Node curr = front; 
               while(curr.next!= null){
                  curr= curr.next;
               }
               Node temp  = new Node(data); //create new node at end of list   
               temp.prev = curr; 
               curr.next = temp; 
               
          }//end if else  
          size++;       
    }//end add()
    
    
    /**this method adds values at specified position and adjusts 
    the next/prev links */
    public void add(int pos, int val){
         if(pos < 0 || pos > size){ throw new IllegalArgumentException();
         }else if(isEmpty()) { //create new list if front is null
             front = new Node(val);
             size++;
         }else if(pos == 0 && !isEmpty()) { //add to beginning of list
            Node temp = new Node(val); 
            front.prev = temp; 
            temp.next = front; 
            front = temp; 
            size++; 
         }else if(pos > 0 & pos < size){//find node right at position and add new node before it
            Node curr = front; 
            for(int i = 0; i < pos; i++){
                  curr = curr.next;             
            }
            Node temp = new Node(val);
            temp.next = curr.next;  
            temp.prev = curr;  
            curr.next.prev = temp; 
            curr.next = temp; 
            size++;
         }else{//add at end of list 
               add(val);
         }//end if- else
    }//end add
    
    
    /**
    finds biggest int 
    @return the highest int
    @return -1000 if list is empty*/
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
            return -1000; }//only return this number if list is null     
    }//end findMax
    
    
    /**
    finds smallest int 
    @return the smallest int
    @return -1000 if list is empty*/
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
         return -1000; }//only return this number if list is null  
    }//end findMin
    
    /**
    finds average of ints in list 
    @return the average calculated
    @return -1000 if list is empty*/
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
         return -1000; }//only return this number if list is null        
    } //end findAverage 
      
         
   /** this method will print the list by using 
   a loop to traverse each node and print statements to 
   print the data within each node visited */
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
   
    /** this method is used as a test to check
     doubly linked list prev links by printing backwards */
        public void printBack(){
         Node curr = front; 
         if(curr != null){//get to last node
            while(curr.next!= null){
               curr = curr.next; }//end loop
            for(int i = size -1; i >= 0; i--){
               System.out.print(" ["+curr.data+"] " ); 
               curr= curr.prev; 
               }//end for loop
          }else{System.out.print("[]"); }
      }//end printBack



      /**private ListNode class with constructors to use in above class of creating 
      DoublyLL of nums*/
      private class Node{
         private int data;
         private Node next; 
         private Node prev; 
         
         public  Node(int data){
            this.data = data; 
            this.next = null; 
            this.prev = null; 
          }//end constructor
          
          
          public Node(int data, Node nxt, Node p){
               this.data = data; 
               next = nxt; 
               prev = p; 
          }
             
      }//end node class
      
             
}//end DubLinkedList clas