package model;

public class GenericModel<E> {
    E elem;

    public GenericModel(E elem) {
        if (elem instanceof Cat)
            System.out.println("Initialized by class Cat");
        if (elem instanceof Dog)
            System.out.println("Initialized by class Dog");
        else
            this.elem = elem;
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    @Override
    public String toString() {
        return "GenericModel{" +
                "elem=" + elem +
                '}';
    }
}
