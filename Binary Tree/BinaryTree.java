import java.util.*; 

/**
Olga Sirotinsky
asg 7 ad 300 2016
This will be the binary tree class that will be used in the BTprogram that builds a Btree
*/

public class BinaryTree {
   private BTNode root;   
   private int size; 
   
   //constructor for BTree class
   public BinaryTree(){
      root = null; 
      size = 0;        
   }//end constructor
   
   
   //public add method adds new nodes to tree
   public void add(int num){
      if(root == null){//creating very first node
         root = new BTNode(num);
      }else{
         addToSub(root, null, num); }
   }//end add
   
   
   //private method to search recursively and compare values to add to sub tree 
   private void addToSub(BTNode child, BTNode parent, int num){
      if(child == null){//create new root node if tree is empty
          size++; 
          child = new BTNode(num);  
          if(num > parent.data){
            parent.right = child; 
            }
          if(num < parent.data){
            parent.left = child;
             }      
      }else if(num > child.data){//add to the right sub tree  
           addToSub(child.right, child,  num);    //traverse to end of tree until you get null     
      }else if(num < child.data){//add to left subtree if data is less than current root data
           addToSub(child.left, child, num);  //traverse recursively      
      }
      //case when data is a duplicate we will skip it      
   }//end add     
        
      
   // method prints tree 
   public void print(){
      print(root); 
      System.out.println(); 
   }//end print
   
   
   //private method to use in print() & hide root node
   private void print(BTNode r){
      //base case is to do nothing if its empty
      if(r != null){
         //recursive case: print left, root,  right
         print(r.left); 
         System.out.print(r.data + " "); 
         print(r.right); 
      }
   }//end private print
   
   
   
   //private BTNode class that creates one node in above Btree
   private class BTNode {
      public BTNode left;
      public BTNode right;  
      public int data; 
      
      //constructor that creates a leaf node with data in param. 
      public BTNode(int num){
         this(num, null, null); 
      }//end constructor
      
      //constructor for a branch node
      public BTNode(int data, BTNode left, BTNode right){
         this.data = data; 
         this.left = left; 
         this.right = right; 
      }//end constructor
   }//end node class
}//end BT class