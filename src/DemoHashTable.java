import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashTable {

    private Student[] hashtable;

    public DemoHashTable() {
        this.hashtable = new Student[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }


    public void put(String key, Student value) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("sorry, there is already a value present at this index:" + hashedKey);
        } else {
            hashtable[hashedKey] = value;
        }
    }

    public Student get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printhashTable(){
        for (int i=0; i< hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
    }
}
