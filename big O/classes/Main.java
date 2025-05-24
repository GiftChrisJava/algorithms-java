package classes;

import java.util.HashMap;

public class Main {
public static void main(String[] args) {
    // Cookie cookie = new Cookie("red");
    // System.out.println("Cookie color: " + cookie.getColor());
    
    // cookie.setColor("blue");
    // System.out.println("Updated cookie color: " + cookie.getColor());
    
    HashMap<String, Integer> map1 = new HashMap<>();
    HashMap<String, Integer> map2 = new HashMap<>();

    map1.put("value", 11);

    map2 = map1;

    System.out.println("\nMap1: " + map1);
    System.out.println("Map2: " + map2);

}
}
