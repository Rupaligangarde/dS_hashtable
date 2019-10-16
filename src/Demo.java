public class Demo {
    public static void main(String[] args) {

        Student rupali = new Student("rupali", 1);
        Student mike = new Student("mike", 2);
        Student wilson = new Student("white walter", 3);


        DemoHashTable hashTable = new DemoHashTable();
        hashTable.put("rupali", rupali);
        hashTable.put("mike", mike);
        hashTable.put("white walter", wilson);

        hashTable.printhashTable();
        System.out.println("value is: " + hashTable.get("rupali"));
    }
}
