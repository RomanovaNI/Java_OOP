package model;

import java.util.Iterator;

public class MyStringReverseIterator implements Iterator<Character> {
    private StringBuilder str;
    private int curPos;
    int size;


    public MyStringReverseIterator(StringBuilder str) {
        this.str = str;
        curPos = str.length() - 1;
        size = str.length();

    }

    @Override
    public boolean hasNext() {
        return curPos >= 0;
    }

    @Override
    public Character next() {
        Character res = str.charAt(curPos);
        curPos--;
        return res;
    }

    @Override
    public void remove() {
        curPos++;
        str.deleteCharAt(curPos);
        size--;

    }
}
