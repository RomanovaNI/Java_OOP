package model;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private StringBuilder str;

    public MyString(String str) {
        this.str = new StringBuilder(str);
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    public void add(char c) {
        str.append(c);
    }

    public boolean remove(char c) {
        int index = str.indexOf(Character.toString(c));
        if (index >= 0) {
            str.deleteCharAt(index);
            return true;
        } else {
            return false;
        }

    }

    public StringBuilder getStr() {
        return str;
    }

    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }

    public Iterator<Character> reverseIterator() {
        return new MyStringReverseIterator(str);
    }
}
