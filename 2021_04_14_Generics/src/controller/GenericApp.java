package controller;

import model.Cat;
import model.Dog;
import model.GenericModel;

public class GenericApp {
    public static void main(String[] args) {
        // создать объекты классов Cat и Dog
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        // При помощи них создать 2 объекта
        // dogGenericModel, в котором E это Dog
        //  catGenericModel, в котором E это Cat
        //  unknownGenericModel в котором E это любой класс-оболочка по вашему желанию

        GenericModel<Cat> catGenericModel = new GenericModel<>(cat1);
        // System.out.println(catGenericModel);
        GenericModel<Dog> dogGenericModel = new GenericModel<>(dog1);
        // System.out.println(dogGenericModel);
        GenericModel<String> unknownGenericModel = new GenericModel<>("hey");
        System.out.println(unknownGenericModel);

        //  Попробовать создать объект dogGenericModel2, в котором E это Dog, при помощи объекта класса Cat
        GenericModel<Dog> dogGenericModel2 = new GenericModel<>(cat1);
//Попробовать создать новый объект cat2 и присвоить ему значение геттера из dogGenericModel;
        Cat cat2 = new Cat();

        //  Попробовать использование кастинга в обоих случаях


    }

}
