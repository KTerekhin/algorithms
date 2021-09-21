package lesson4;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        runMyLinkedListApp();
        runListIteratorApp();
    }

    public static void runMyLinkedListApp() {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Maria");
        mll.insertFirst("Katya");
        mll.insertFirst("Luba");

        System.out.println(mll);

        Iterator<String> iterator = mll.iterator();
        iterator.next();
        iterator.remove();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println();
    }

    public static void runListIteratorApp() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        ListIterator<String> listIterator = myLinkedList.listIterator();

        listIterator.add("1Каждый");
        listIterator.add("2Охотник");
        listIterator.add("3Желает");
        listIterator.add("4Знать");
        listIterator.add("5Где");
        listIterator.add("6Сидит");
        listIterator.add("7Фазан");

        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        listIterator.remove();

        System.out.println(myLinkedList);
    }
}
