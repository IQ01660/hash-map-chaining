import java.util.*

public class HashMap {
    private final LOAD_THRESHOLD_FACTOR = 2;

    private LinkedList[] array = new LinkedList[100]; 

    public static void main(String[] args) {
        
    }
    
   
    public void put(int key, int value) {
        LinkedList toAdd = new LinkedList(key, value);

        int hash_code = this.hashFunction(key);

        LinkedList chain_tail = this.array[hash_code];
        
        // if no elts in the slot just add the first linked list node and return
        if (chain_tail == null) {
            this.array[hash_code] = toAdd;
            return;
        }
        // otherwise get to the tail of the chain
        while(chain_tail.next != null) {
            chain_tail = chain_tail.next;
        }
        
        chain_tail.next = toAdd;
        return;
    }

    public int get(int key) {

    }
    
    private int hashFunction(int key) {
        return key % array.length;
    }

}

class LinkedList {
    public LinkedList next = null;
    public int value;
    public int key;

    public LinkedList(int key, int value) {
        this.key = key;
        this.value = value;
    }

}
