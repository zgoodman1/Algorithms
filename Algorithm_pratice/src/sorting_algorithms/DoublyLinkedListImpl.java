package sorting_algorithms;

public class DoublyLinkedListImpl implements LIST_Interface {
  Node sentinel; //this will be the entry point of linked list
  public int size;
  private Node head;
  private Node tail;
  
  public DoublyLinkedListImpl(){
    sentinel=new Node(0);
  }
    
  public Node getRoot(){ 
    return sentinel;
  }

@Override
public boolean insert(double elt, int index) {
	int i;
	Node newN = new Node(elt);
	if (index > size() || index < 0) {
		return false;
	}
	if(index == 0) {
		//insert at head of list
		if(size == 0) {
			//insert into empty list
			sentinel.next = newN;
			sentinel.prev = newN;
			newN.next = sentinel;
			newN.prev = sentinel;
			size++;
		} else {
			//inserting into non empty list
			head = sentinel.next;
			newN.next = head;
			newN.prev = sentinel;
			head.prev = newN;
			sentinel.next = newN;
			head = newN;
			size++;
		}
	}else
	if(index == size-1) {
		//inserting into tail of list
		tail = sentinel.prev;
		newN.next = sentinel;
		newN.prev = tail;
		tail.next = newN;
		sentinel.prev = newN;
		tail = newN;
		size++;
	} else {
	//otherwise inserting somewhere in the middle of the list
	head = sentinel.next;
	Node curr = head;
	for(i = 0; i < index; i++) {
		curr = curr.next;
	}
	//curr is now the node at the index in question
	newN.next = curr;
	newN.prev = curr.prev;
	curr.prev.next = newN;
	curr.prev = newN;
	size++;
	
}
	return true;
}

@Override
public boolean remove(int index) {
	if (index < 0 || index >= size || size == 0) {
		return false;
	}
	Node curr = sentinel.next;
	for(int i = 0; i < index; i++) {
		curr = curr.next;
	}
	//curr now equals the node at the index in question
	curr.prev.next = curr.next;
	curr.next.prev = curr.prev;
	size--;
	return true;
}

@Override
public double get(int index) {
	if(index < 0 || index >= size) {
		return Double.NaN;
	}
	if(index == 0) {
		if(sentinel.next == null) {
			//returns nothing if list is empty
			return Double.NaN;
		} else {
			//returns data from first value of list
			// which is sentinel's next
			return sentinel.next.data;
		}
	} else if (index == size-1) {
		//returns data from last value in the list
		//which is sentinel's previous
		return sentinel.prev.data;
	} else {
		//fetching data from value somewhere in middle
		Node curr = sentinel.next;
		for(int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.data;
	}
}

@Override
public int size() {
	return size;
}

@Override
public boolean isEmpty() {
	return size == 0;
}

@Override
public void clear() {
	sentinel.next = sentinel;
	sentinel.prev = sentinel;
	size = 0;
}
}