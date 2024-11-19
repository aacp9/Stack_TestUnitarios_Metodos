package org.example;


import stack.StackImpl;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello doc!");
        StackImpl stackImpl = new StackImpl();

        stackImpl.setMaxSize(4);
        System.out.println("cantidad de elementos: " + stackImpl.size());
        System.out.println("tamaño del stack: " + stackImpl.getMaxSize());
        stackImpl.push(1);
        stackImpl.push(2);
        stackImpl.push(1);
        stackImpl.push(2);
        System.out.println("ver elemento ùltimo elemento " + stackImpl.peek());
        System.out.println("Elementos de la lista: " + stackImpl.toString());
        System.out.println("cantidad de elementos: " + stackImpl.size());
        System.out.println("tamaño del stack: " + stackImpl.getMaxSize());



    }
}