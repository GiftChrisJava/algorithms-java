
public class Oof1 {
    public static void main(String[] args) {
        System.out.println(addItems(4));
    }

    public static int addItems(int n) {
        // to be specific its O(1) because we have one operation which is the additon
        return n + n; // O(n) 
    }
}
