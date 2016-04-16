package hashTable;

public class HashTable {

	private int[] hashArray;
	
	
	public void genHashArray (int tableLength) {
		hashArray = new int[tableLength];
		for (int i = 0; i < tableLength; i++){
			hashArray[i] = i;
		}
	}

	
	
}
