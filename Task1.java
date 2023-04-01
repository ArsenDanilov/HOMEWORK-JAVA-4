import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class Task1 {
    
    public static void main(String[] args) {
        
        LinkedList <Integer> llist = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            llist.add(random.nextInt(0, 10));

        }
        System.out.println("Вывод массива до переворота: " + llist);
        reverseList(llist);
        System.out.println("Вывод массива после переворота: " + llist);
    }

    static void reverseList(LinkedList<Integer> list){
        int size = list.size();

        for (int i = 0; i < size/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
            
        }
    }
}
