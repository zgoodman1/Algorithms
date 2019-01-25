package sorting_algorithms;

public class Node { 
  public double data;
  public Node next; 
  public Node prev; 
  public Node(double data){
    this.data=data;
    this.next=null;
    this.prev=null;
  }
  public String toString(){
    return "data: "+data+"\thasNext: "+(next!=null)+"\t\thasPrev: "+(prev!=null);
  }
  
  public boolean isNode(){ 
    return true;
  }
  public double getData(){ 
    return data;
  }
  public Node getNext(){ 
    return next;
  }
  public Node getPrev(){ 
    return prev;
  }
}