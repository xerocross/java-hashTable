package hashTable;


class ListItem<T> {
	public T element;
	public T next;
	
	ListItem (T element, T next){
		this.element = element;
		this.next = next;
	}
}

public class LinkedList<T> {
	public ListItem<T> firstItem;

	LinkedList(ListItem<T> firstItem){
		this.firstItem = firstItem;
	}
}
