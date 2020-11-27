/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Odev1;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static boolean search(ArrayList<Integer> array,int a , int b){
        if(array == null) return false;
        if(a < 0 || b < 0) return false;
        for(int elt : array){
            if(elt == (a + b)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
