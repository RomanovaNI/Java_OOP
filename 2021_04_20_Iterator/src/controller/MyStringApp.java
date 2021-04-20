package controller;

import model.MyString;
import model.MyStringReverseIterator;

import java.util.Iterator;

public class MyStringApp {
    public static void main(String[] args) {
        MyString myStr = new MyString("Hello World");
        MyString myStr2 = new MyString("Berlin");
        // System.out.println(myStr);
        myStr.add('!');
        // System.out.println(myStr);
        myStr.remove('d');
        //   System.out.println(myStr);
        for (Character c : myStr) {
            //   System.out.print(Character.toUpperCase(c));
        }
        //  System.out.println();
        removeWithIterator(myStr, 'o');
        System.out.println(myStr);
        removeWithRevIterator(myStr2, 'e');


        Iterator<Character> rev = myStr2.reverseIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next());
        }

        System.out.println();

    }

    private static void removeWithRevIterator(MyString str, char ch) {
        Iterator<Character> myStringRevIterator = str.reverseIterator();
        while (myStringRevIterator.hasNext()) {
            // System.out.print(myStringRevIterator.next());
            Character c = myStringRevIterator.next();
            if (c == ch) {
                myStringRevIterator.remove();
            }
        }
    }

    private static void removeWithIterator(MyString myStr, char ch) {
        Iterator<Character> myStringIterator = myStr.iterator();
        while (myStringIterator.hasNext()) {
            Character c = myStringIterator.next();
            if (c == ch) {
                myStringIterator.remove();
            }
        }
    }


}


