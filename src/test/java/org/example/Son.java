package org.example;

public class Son implements Father{
    @Override
    public void doThisMandatory() {
        System.out.println("I will do this");
    }
}
