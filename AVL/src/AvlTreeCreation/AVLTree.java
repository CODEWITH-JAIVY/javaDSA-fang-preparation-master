package AvlTreeCreation;

public class Insertion {
    //Node class
    class Node  {
        Node left ;
        Node right  ;
        int key  ;
        int hight  ;

         Node ( int key ) {
             this.key = key  ;
             this.hight =1  ; // new node added intialai at the leaft
         }
    }

  private  Node root  ;

    // get hiehgt of the a node
    int height ( Node n ) {
        if(n == null ) return  0 ;
        return  n.hight;
    }

    // get blance factor of the node

    int getBalance(Node n ) {
        if(n == null ) return  0;
        return  height(n.left) - height(n.right) ;
    }
  // right rotaion
    Node rightRotation ( Node  y  ){
     Node x = y.left ;
     Node t2 = y.right ;

     // perforn rotation
        x.right = y ;
        x.left = t2 ;

        // update hight
        y.hight = Math.max( height(y.left) ,  height(y.right))+1 ;
        x.hight = Math.max(height(x.left) , height(x.right)) +1  ;

        return  x  ; // new root

    }
 ///  left Rotation
    Node leftRotion ( Node   x ) {
        Node y = x.right ;
        Node t2 = y.left ;
        // perform rotation
        y.left = x  ;
        x.right = t2 ;
        // update hight

        x.hight = Math.max(height(x.left) , height(x.right))+1  ;
        y.hight = Math.max(height(y.left) , height(y.right)) +1 ;

        return  y ;

    }
// insert a key
    Node insert (Node node  ,  int key ) {
        // normal bst insertion
        if(node == null ) return new Node(key ) ;

        if(key < node.key)
             node.left=  insert( node.left, key);
        else if (key > node.key)
             node.right = insert(node.right , key) ;
        else
            return node ; // no duplicate allowed

        ///  update height of the ancestor node

        node.hight = Math.max(height(node.left) , height(node.right)) +1  ;

        // get blance facotr
        int balance = getBalance(node ) ;

        // -------------------------
        // 4 Types of Imbalance Cases
        // -------------------------

        // 1 left left case

        if(balance > 1 && key <  node.left.key)
            return rightRotation(node) ;

        // 2  right right rotatino
        if(balance < -1  &&  key > node.right.key )
             return leftRotion(node) ;

        // left right rotation
        if(balance < 1 && key > node.left.key) {
            node.left = leftRotion(node);
            return rightRotation(node);
        }

        // right left rotaion
        if(balance< -1 && key < node.right.key) {
            node.right = rightRotation(node.right);
            return leftRotion(node);
        }
        return  root ;
    }
 // wapper to insert into root
    public  void  insert(int key ) {
        root =  insert(root , key ) ;
    }
// preorder traversal
// Preorder traversal
public void preOrder(Node node) {
    if (node != null) {
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

    public void printPreOrder() {
        preOrder(root);
    }

    















}